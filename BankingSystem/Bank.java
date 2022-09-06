import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * read data.
     *
     * @param inputStream .
     */
    public void readCustomerList(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        Customer customer = null;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] info = line.split(" ");
            if (!info[0].chars().allMatch(Character::isDigit)) {
                long idNumber = Long.parseLong(info[info.length - 1]);
                String[] fullName = new String[info.length - 1];
                System.arraycopy(info, 0, fullName, 0, info.length - 1);
                String name = String.join(" ", fullName);
                customer = new Customer(idNumber, name);
                customerList.add(customer);
            } else {
                if (info[1].equals(Account.CHECKING)) {
                    customer.addAccount(new CheckingAccount(Long.parseLong(info[0]),
                            Double.parseDouble(info[2])));
                } else {
                    customer.addAccount(new SavingsAccount(Long.parseLong(info[0]),
                            Double.parseDouble(info[2])));
                }
            }
        }
    }

    /**
     * get info id order.
     *
     * @return .
     */
    public String getCustomersInfoByIdOrder() {
        List<Customer> listCustomer = new ArrayList<>(customerList);
        listCustomer.sort(Comparator.comparing(Customer::getIdNumber));
        String str = "";
        for (Customer customer : listCustomer) {
            str += customer.getCustomerInfo();
        }
        return str.substring(0, str.length() - 1);
    }

    /**
     * get info name order.
     *
     * @return .
     */
    public String getCustomersInfoByNameOrder() {
        List<Customer> listCustomer = new ArrayList<>(customerList);
        listCustomer.sort(Comparator.comparing(Customer::getFullName));
        String str = "";
        for (Customer customer : listCustomer) {
            str += customer.getCustomerInfo();
        }
        return str.substring(0, str.length() - 1);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * test.
     *
     * @param args .
     */
    public static void main(String[] args) {
        Bank bank = new Bank();
        File file = new File("D:\\VNU\\Program\\OOP\\week1\\src\\BankingSystem\\test.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bank.readCustomerList(inputStream);
        System.out.println(bank.getCustomersInfoByIdOrder());
    }
}
