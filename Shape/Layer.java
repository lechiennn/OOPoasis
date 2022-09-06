package Shape;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * add s.
     *
     * @param shape .
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * get info.
     *
     * @return .
     */
    public String getInfo() {
        String str = "Layer of crazy shapes:\n";
        for (Shape s : shapes) {
            str += s.toString();
            str += "\n";
        }
        return str;
    }

    /**
     * remove c.
     */
    public void removeCircles() {
        shapes.removeIf(v -> v instanceof Circle);
    }

    /**
     * remove d.
     */
    public void removeDuplicates() {
        List<Shape> temp = new ArrayList<>();
        int size = shapes.size();
        int[] flag = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    flag[j] = 1;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (flag[i] != 0) {
                continue;
            }
            temp.add(shapes.get(i));
        }
        shapes = temp;
    }
}
