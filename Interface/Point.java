package Interface;

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

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)", pointX, pointY);
    }
}
