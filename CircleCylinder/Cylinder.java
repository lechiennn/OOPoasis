package CircleCylinder;
import Shape.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    /**
     * Constructor.
     *
     * @param radius .
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Constructor.
     *
     * @param radius .
     * @param height .
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor.
     *
     * @param radius .
     * @param height .
     * @param color  .
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * to str.
     *
     * @return .
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    /**
     * get area.
     *
     * @return .
     */
    @Override
    public double getArea() {
        return super.getArea();
    }

    /**
     * get volume.
     *
     * @return .
     */
    public double getVolume() {
        return height * getArea();
    }
}
