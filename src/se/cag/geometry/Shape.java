package se.cag.geometry;

/**
 * @see <a href="https://gist.github.com/KristofferV/952493dfa53b1349e684c4fa2f203403">C.A.G Geometry Calculator</a>
 * @version 1.0.0
 * @author Xotic750 xotic750@gmail.com
 */
public abstract class Shape {
    
    /**
     * To find the circumference of a shape.
     *
     * @return The circumference unit distance measurement.
     */
    public abstract double circumference();

    /**
     * To find the area of a shape.
     *
     * @return The area unit square measurement.
     */
    public abstract double area();

}
