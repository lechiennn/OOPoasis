package Shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Constructor.
     */
    public Shape() {
    }

    /**
     * Constructor.
     *
     * @param color  .
     * @param filled .
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * get area.
     *
     * @return .
     */
    public abstract double getArea();

    /**
     * get p.
     *
     * @return .
     */
    public abstract double getPerimeter();

    /**
     * to str.
     *
     * @return .
     */
    @Override
    public String toString() {
        return String.format("Shape.Shape[color=%s,filled=%b]", color, filled);
    }
}
