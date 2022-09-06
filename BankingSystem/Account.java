import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    /**
     * constructor.
     */
    public Account() {
    }

    /**
     * constructor.
     *
     * @param accountNumber .
     * @param balance       .
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * deposit.
     *
     * @param deposit .
     */
    public abstract void deposit(double deposit);

    /**
     * withdraw.
     *
     * @param withdraw .
     */
    public abstract void withdraw(double withdraw);

    /**
     * do deposit.
     *
     * @param deposit .
     * @throws InvalidFundingAmountException .
     */
    public void doDepositing(double deposit) throws InvalidFundingAmountException {
        if (deposit > 0) {
            balance += deposit;
        } else {
            throw new InvalidFundingAmountException(deposit);
        }
    }

    /**
     * do withdraw.
     *
     * @param withdraw .
     * @throws BankException .
     */
    public void doWithdrawing(double withdraw) throws BankException {
        if (withdraw <= balance && withdraw > 0) {
            balance -= withdraw;
        } else if (withdraw < 0) {
            throw new InvalidFundingAmountException(withdraw);
        } else {
            throw new InsufficientFundsException(withdraw);
        }
    }

    /**
     * add transaction.
     *
     * @param transaction .
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * get history.
     *
     * @return .
     */
    public String getTransactionHistory() {
        String str = "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";
        for (Transaction i : transactionList) {
            str += i.getTransactionSummary() + "\n";
        }
        return str;
    }

    /**
     * override equal.
     *
     * @param obj .
     * @return .
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Account)) {
            return false;
        }
        return ((Account) obj).getAccountNumber() == this.accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
