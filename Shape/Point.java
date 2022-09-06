package Shape;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     *
     * @param x .
     * @param y .
     */
    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * get distance.
     *
     * @param p .
     * @return .
     */
    public double distance(Point p) {
        double x = Math.pow(this.pointX - p.getPointX(), 2);
        double y = Math.pow(this.pointY - p.getPointY(), 2);
        return Math.sqrt(x + y);
    }

    /**
     * equals.
     *
     * @param obj .
     * @return .
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        boolean x = Math.abs(((Point) obj).getPointX() - pointX) < 0.001;
        boolean y = Math.abs(((Point) obj).getPointY() - pointY) < 0.001;
        return x && y;
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
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }
}
