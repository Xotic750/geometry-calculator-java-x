package se.cag.geometry;

/**
 * @see <a href="https://gist.github.com/KristofferV/952493dfa53b1349e684c4fa2f203403">C.A.G Geometry Calculator</a>
 * @version 1.0.0
 * @author Xotic750 xotic750@gmail.com
 */
public class Circle extends Shape {

    private final double r;

    /**
     * A circle is a simple closed shape in Euclidean geometry. It is the set of
     * all points in a plane that are at a given distance from a given point,
     * the centre; equivalently it is the curve traced out by a point that moves
     * so that its distance from a given point is constant. The distance between
     * any of the points and the centre is called the radius.
     *
     * @param r The radius unit distance measurement.
     */
    public Circle(double r) {
        this.r = r;
    }

    /**
     * The circumference of a circle relates to one of the most important
     * mathematical constants in all of mathematics.
     * <pre>Circumference = 2 * PI * r</pre>
     *
     * @return The circumference unit distance measurement.
     */
    @Override
    public double circumference() {
        return 2 * Math.PI * this.r;
    }

    /**
     * To find the area of a circle.
     * <pre>Area = PI * (r^2)</pre>
     *
     * @return The area unit square measurement.
     */
    @Override
    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }

}
