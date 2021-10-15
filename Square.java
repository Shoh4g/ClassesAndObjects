
/**
* The Square class is used to model squares. It is a subclass of the Shape class and it inherits all
* the instance variables and methods of the Shape class. The Square class overrides the
* setVertices() method for setting the local coordinates of the 4 vertices of a standard square.
* 
* @author SHOHAG
* @version 1.2
*/


public class Square extends Shape {
	/**
	 * a method for setting the local coordinates of the 4
     * vertices of a standard square. Here, a standard square has its center located at (0, 0) and
     * its sides being parallel to the x- and y-axes of its local coordinate system.
     * 
     * @param  The parameter size specifies half-the-length of a side of the square.It is the value from which local coordinates will be determined
	 */
  
	public void setVertices(double size) {
		// local coordinates in  X-axis
		xLocal = new double[]{size, size, -size, -size};
		// local coordinates in Y-axis
		yLocal = new double[]{size, -size, -size, size};
		
}

}