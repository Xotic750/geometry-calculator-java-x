package se.cag.geometry;

/**
 * @see <a href="https://gist.github.com/KristofferV/952493dfa53b1349e684c4fa2f203403">C.A.G Geometry Calculator</a>
 * @version 1.0.0
 * @author Xotic750 xotic750@gmail.com
 */
public class RightAngledTriangle extends Shape {

    private final double x;
    private final double y;
    private final double h;

    /**
     * A right triangle (American English) or right-angled triangle (British
     * English) is a triangle in which one angle is a right angle (that is, a
     * 90-degree angle). The relation between the sides and angles of a right
     * triangle is the basis for trigonometry.
     *
     * @param x The base unit distance measurement.
     * @param y The height unit distance measurement.
     * @param h The hypotenuse unit distance measurement.
     */
    public RightAngledTriangle(double x, double y, double h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    /**
     * The circumference of a right angled triangle is the sum of the three side
     * lengths.
     * <pre>Circumference = x + y + h</pre>
     *
     * @return The circumference unit distance measurement.
     */
    @Override
    public double circumference() {
        return x + y + h;
    }

    /**
     * The area is given by the area formula for an arbitrary triangle.
     * <pre>Area = (1 / 2) * B * h</pre> If the triangle is right angled, as in
     * this case, the side y is the same as the height an y is the same as the
     * base line.
     * <pre>Area = (1 / 2) * y * x</pre>
     *
     * @return The area unit square measurement.
     */
    @Override
    public double area() {
        return 0.5 * x * y;
    }

}
