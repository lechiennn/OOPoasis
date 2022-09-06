package Expression;

public class Addition extends BinaryExpression {
    /**
     * constructor.
     *
     * @param left  .
     * @param right .
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * to str.
     *
     * @return .
     */
    @Override
    public String toString() {
        return String.format("(%s + %s)", left.toString(), right.toString());
    }

    /**
     * ab.
     *
     * @return .
     */
    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
