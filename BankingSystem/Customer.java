import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * constructor.
     */
    public Customer() {
    }

    /**
     * constructor.
     *
     * @param idNumber .
     * @param fullName .
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * get customer info.
     *
     * @return .
     */
    public String getCustomerInfo() {
        return String.format("Số CMND: %d. Họ tên: %s.\n", idNumber, fullName);
    }

    /**
     * add account.
     *
     * @param account .
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * remove account.
     *
     * @param account .
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
