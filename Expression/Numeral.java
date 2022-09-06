package Expression;

public class Numeral extends Expression {
    private double value;

    /**
     * Constructor.
     */
    public Numeral() {
    }

    /**
     * Constructor.
     *
     * @param value .
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * to str.
     *
     * @return .
     */
    @Override
    public String toString() {
        int intValue = (int) value;
        if (intValue == value) {
            return String.valueOf(intValue);
        }
        return String.valueOf(value);
    }

    /**
     * ab.
     *
     * @return .
     */
    @Override
    public double evaluate() {
        return value;
    }
}
