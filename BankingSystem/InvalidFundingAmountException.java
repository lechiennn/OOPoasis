public class InvalidFundingAmountException extends BankException {
    /**
     * constructor.
     *
     * @param amount .
     */
    public InvalidFundingAmountException(double amount) {
        super(String.format("Số tiền không hợp lệ: $%.2f", amount));
    }
}