package Transaction;
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * deposit.
     *
     * @param amount is amount.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    /**
     * withdraw.
     *
     * @param amount is amount.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
        }
    }

    /**
     * add transaction.
     *
     * @param amount is amount.
     * @param operation is operation.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            transitionList.add(new Transaction(operation, amount, this.balance));
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
            transitionList.add(new Transaction(operation, amount, this.balance));
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * print transactions.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            double amount = transitionList.get(i).getAmount();
            double bal = transitionList.get(i).getBalance();
            String op = transitionList.get(i).getOperation();
            System.out.printf("Giao dich %d: ", i + 1);
            if (op.equals(Transaction.DEPOSIT)) {
                System.out.printf("Nap tien ");
            } else {
                System.out.printf("Rut tien ");
            }
            System.out.printf("$%.2f. So du luc nay: $%.2f.\n", amount, bal);
        }
    }
}
