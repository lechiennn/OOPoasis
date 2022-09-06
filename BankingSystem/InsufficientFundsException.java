public class InsufficientFundsException extends BankException {
    /**
     * constructor.
     *
     * @param amount .
     */
    public InsufficientFundsException(double amount) {
        super(String.format("Số dư tài khoản không đủ $%.2f để thực hiện giao dịch", amount));
    }
}
