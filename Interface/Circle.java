package Interface;

public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * constructor.
     *
     * @param center .
     * @param radius .
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * override area.
     *
     * @return .
     */
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * override p.
     *
     * @return .
     */
    @Override
    public double getPerimeter() {
        return PI * 2 * radius;
    }

    /**
     * override info.
     *
     * @return .
     */
    @Override
    public String getInfo() {
        return String.format("Circle[%s,r=%.2f]", center.toString(), radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
