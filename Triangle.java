
/**
* The Triangle class is used to model triangles. Like the Square class, it is a subclass of the
* Shape class and it inherits all the instance variables and methods of the Shape class. The
* Triangle class overrides the setVertices() method for setting the local coordinates of the 3
* vertices of a standard triangle.
* 
* @author SHOHAG
* @version 1.2
*/


public class Triangle extends Shape {
	/**
	 * a method for setting the local coordinates of the 3
     * vertices of a standard triangle. Here, a standard triangle is an equilateral triangle having
     * its center located at (0, 0) and one of its vertex on the positive x-axis of its local
     * coordinate system. 
     * 
     * @param The parameter size specifies the distance from the center of the
     * triangle to any of its vertices. It is value from which local coordinates will be determined
	 */
	
	
	public void setVertices(double size) {
		// converting degree to radian
		double a = Math.toRadians(60);
		// local coordinates in  X-axis
		double[] x = new double[]{size, -size*Math.cos(a), -size*Math.cos(a)};
		// local coordinates in Y-axis
		double[] y = new double[]{0, -size*Math.sin(a), size*Math.sin(a)};	
		xLocal = x;
		yLocal = y;
}

}