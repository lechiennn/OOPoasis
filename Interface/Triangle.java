package Interface;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * constructor.
     *
     * @param p1 .
     * @param p2 .
     * @param p3 .
     */
    public Triangle(Point p1, Point p2, Point p3) {
        double d12 = p1.distance(p2);
        double d23 = p2.distance(p3);
        double d13 = p1.distance(p3);
        if (d12 + d23 <= d13 || d12 + d13 <= d23 || d23 + d13 <= d12) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * override area.
     *
     * @return .
     */
    @Override
    public double getArea() {
        double d12 = p1.distance(p2);
        double d23 = p2.distance(p3);
        double d13 = p1.distance(p3);
        double p = (d12 + d23 + d13) / 2;
        return Math.sqrt(p * (p - d12) * (p - d23) * (p - d13));
    }

    /**
     * override p.
     *
     * @return .
     */
    @Override
    public double getPerimeter() {
        double d12 = p1.distance(p2);
        double d23 = p2.distance(p3);
        double d13 = p1.distance(p3);
        return d12 + d23 + d13;
    }

    /**
     * override info.
     *
     * @return .
     */
    @Override
    public String getInfo() {
        return String.format("Triangle[%s,%s,%s]",
                p1.toString(), p2.toString(), p3.toString());
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }
}
