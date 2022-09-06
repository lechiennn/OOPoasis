package Interface;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /**
     * print.
     *
     * @param geometricObjectList .
     * @return .
     */
    public String printInfo(List<GeometricObject> geometricObjectList) {
        List<GeometricObject> circleList = new ArrayList<>();
        List<GeometricObject> triangleList = new ArrayList<>();

        for (GeometricObject object : geometricObjectList) {
            if (object instanceof Circle) {
                circleList.add(object);
            } else {
                triangleList.add(object);
            }
        }
        String str = "";
        str += "Circle:\n";
        for (GeometricObject circle : circleList) {
            str += circle.getInfo() + "\n";
        }
        str += "Triangle:\n";
        for (GeometricObject triangle : triangleList) {
            str += triangle.getInfo() + "\n";
        }
        return str;
    }
}
