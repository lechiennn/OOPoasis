package Shape;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * Constructor.
     */
    public Circle(double radius, String color) {
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
     * @param filled .
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructor.
     *
     * @param center .
     * @param radius .
     * @param color  .
     * @param filled .
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
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

    /**
     * get a.
     *
     * @return .
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * get p.
     *
     * @return .
     */
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * eq.
     *
     * @param obj .
     * @return .
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        boolean r = Math.abs(radius - ((Circle) obj).getRadius()) < 0.001;
        return r && center.equals(((Circle) obj).getCenter());
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
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                center.toString(), radius, color, filled);
    }
}
