package Expression;

public class Division extends BinaryExpression {
    /**
     * constructor.
     *
     * @param left  .
     * @param right .
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * to str.
     *
     * @return .
     */
    @Override
    public String toString() {
        return String.format("(%s / %s)", left.toString(), right.toString());
    }

    /**
     * ab.
     *
     * @return .
     * @throws ArithmeticException .
     */
    @Override
    public double evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
