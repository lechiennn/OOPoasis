package Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Constructor.
     */
    public Rectangle() {
    }

    /**
     * Constructor.
     *
     * @param width  .
     * @param length .
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     *
     * @param width  .
     * @param length .
     * @param color  .
     * @param filled .
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     *
     * @param topLeft .
     * @param width   .
     * @param length  .
     * @param color   .
     * @param filled  .
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * get a.
     *
     * @return .
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * get p.
     *
     * @return .
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * abc.
     *
     * @param object .
     * @return .
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle)) {
            return false;
        }
        boolean w = Math.abs(((Rectangle) object).width - this.width) <= 0.001;
        boolean l = Math.abs(((Rectangle) object).length - this.length) <= 0.001;
        return topLeft.equals(((Rectangle) object).topLeft) && w && l;
    }

    /**
     * dunno.
     *
     * @return .
     */
    public int hashCode() {
        return 0;
    }

    /**
     * to str.
     *
     * @return .
     */
    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                topLeft.toString(), width, length, color, filled);
    }
}
