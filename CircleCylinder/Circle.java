package CircleCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    protected static final double PI = 3.14;

    /**
     * Constructor.
     */
    public Circle() {
    }

    /**
     * Constructor.
     *
     * @param radius .
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor.
     *
     * @param radius .
     * @param color  .
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * get area.
     *
     * @return .
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * to str.
     * @return .
     */
    @Override
    public String toString() {
        return "Shape.Circle[radius=" + radius + ",color=" + color + "]";
    }
}
