public class SavingsAccount extends Account {
    /**
     * constructor.
     *
     * @param accountNumber .
     * @param balance       .
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * override deposit.
     *
     * @param deposit .
     */
    @Override
    public void deposit(double deposit) {
        try {
            double initialBalance = balance;
            doDepositing(deposit);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    deposit, initialBalance, balance));
        } catch (InvalidFundingAmountException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * override withdraw.
     *
     * @param withdraw .
     */
    @Override
    public void withdraw(double withdraw) {
        try {
            double initialBalance = balance;
            if (withdraw <= 1000 && initialBalance - withdraw >= 5000) {
                doWithdrawing(withdraw);
                addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                        withdraw, initialBalance, balance));
            }
        } catch (BankException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
