public class Transaction {
    private double amount;
    private double initialBalance;
    private double finalBalance;
    private int type;

    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    /**
     * constructor.
     *
     * @param type           .
     * @param amount         .
     * @param initialBalance .
     * @param finalBalance   .
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * getTransactionTypeString.
     *
     * @param type .
     * @return .
     */
    private String getTransactionTypeString(int type) {
        switch (type) {
            case TYPE_DEPOSIT_CHECKING:
                return "Nạp tiền vãng lai";

            case TYPE_WITHDRAW_CHECKING:
                return "Rút tiền vãng lai";

            case TYPE_DEPOSIT_SAVINGS:
                return "Nạp tiền tiết kiệm";

            case TYPE_WITHDRAW_SAVINGS:
                return "Rút tiền tiết kiệm";

            default:
                return "";
        }
    }

    /**
     * getTransactionSummary.
     *
     * @return .
     */
    public String getTransactionSummary() {
        return String.format("- Kiểu giao dịch: %s. Số dư ban đầu: "
                        + "$%.2f. Số tiền: $%.2f. Số dư cuối: $%.2f.",
                getTransactionTypeString(type), initialBalance, amount, finalBalance);
    }
}
