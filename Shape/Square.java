package Shape;

public class Square extends Rectangle {
    /**
     * Constructor.
     */
    public Square() {
    }

    /**
     * Constructor.
     *
     * @param side .
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor.
     *
     * @param side   .
     * @param color  .
     * @param filled .
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor.
     * @param topLeft .
     * @param side .
     * @param color .
     * @param filled .
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * set side.
     *
     * @param side .
     */
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * set side.
     *
     * @param side .
     */
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        setWidth(side);
    }

    /**
     * abc.
     *
     * @param object .
     * @return .
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Square)) {
            return false;
        }
        boolean w = Math.abs(((Square) object).width - this.width) <= 0.001;
        boolean l = Math.abs(((Square) object).length - this.length) <= 0.001;
        return topLeft.equals(((Square) object).topLeft) && w && l;
    }

    /**
     * to str.
     *
     * @return .
     */
    @Override
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                topLeft.toString(), width, color, filled);
    }
}
