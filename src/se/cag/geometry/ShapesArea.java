package se.cag.geometry;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @see <a href="https://gist.github.com/KristofferV/952493dfa53b1349e684c4fa2f203403">C.A.G Geometry Calculator</a>
 * @version 1.0.0
 * @author Xotic750 xotic750@gmail.com
 */
public class ShapesArea {

    private final ArrayList<Shape> shapes;

    /**
     * Total area of multiple shapes (not only triangles and rectangles but also
     * other types of shapes that implement #area).
     *
     * @param shapes The shapes to calculate the total area of.
     */
    public ShapesArea(Shape... shapes) {
        this.shapes = new ArrayList<>();
        this.shapes.addAll(Arrays.asList(shapes));
    }

    /**
     * To find the area of all the shapes supplied to the constructor.
     *
     * @return The area unit square measurement.
     */
    public double area() {
        return shapes.stream().map((shape) -> shape.area()).reduce(0.0, (accumulator, _item) -> accumulator + _item);
    }

}
