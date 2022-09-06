package Expression;

public class Square extends Expression {
    private Expression expression;

    /**
     * Constructor.
     *
     * @param expression .
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * to str.
     *
     * @return .
     */
    @Override
    public String toString() {
        return String.format("(%s) ^ 2", expression);
    }

    /**
     * e.
     *
     * @return .
     */
    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
