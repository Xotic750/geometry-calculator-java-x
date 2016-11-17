package se.cag.geometry;

/**
 * @see <a href="https://gist.github.com/KristofferV/952493dfa53b1349e684c4fa2f203403">C.A.G Geometry Calculator</a>
 * @version 1.0.0
 * @author Xotic750 xotic750@gmail.com
 */
public class Rectangle extends Shape {

    private final double x;
    private final double y;

    /**
     * In Euclidean plane geometry, a rectangle is a quadrilateral with four
     * right angles. It can also be defined as an equiangular quadrilateral,
     * since equiangular means that all of its angles are equal. It can also be
     * defined as a parallelogram containing a right angle. A rectangle with
     * four sides of equal length is a square. The term oblong is occasionally
     * used to refer to a non-square rectangle.
     *
     * @param x The base unit distance measurement.
     * @param y The height unit distance measurement.
     */
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The circumference of a rectangle is the sum of the two side lengths then
     * doubled.
     * <pre>Circumference = (x + y) * 2</pre>
     *
     * @return The circumference unit distance measurement.
     */
    @Override
    public double circumference() {
        return (x + y) * 2;
    }

    /**
     * To find the area of a rectangle, multiply the length by the width.
     * <pre>Area = x * y</pre>
     *
     * @return The area unit square measurement.
     */
    @Override
    public double area() {
        return x * y;
    }

}
