/**
* The Circle class is used to model circles. Like the Square class and the Triangle class, it is a
* subclass of the Shape class and it inherits all the instance variables and methods of the Shape
* class. The Circle class overrides the setVertices() method for setting the local coordinates
* of the upper left and lower right vertices of an axis-aligned bounding box of a standard circle,
* as well as the getX() and getY() methods for retrieving the screen coordinates of the upper
* left and lower right vertices of this bounding box.
* 
* @author SHOHAG
* @version 1.2
*/
public class Circle extends Shape {
	// local variable to extract the value of size and transfer it to the last two methods
    
	/**
	 * a method for setting the local coordinates of the upper
     * left and lower right vertices of an axis-aligned bounding box of a standard circle. Here,
     * a standard circle is a circle having its center located at (0, 0) of its local coordinate
     * system. 
     * 
     * @param The parameter size specifies the radius of the circle, it is the value from which local coordinates will be determined
	 */
	public void setVertices(double size) {
		// local coordinates in  X-axis
		double[] x = new double[] {-size, size};
		// local coordinates in Y-axis
		double[] y = new double[] {-size, size};
		
		xLocal = x;
		yLocal = y;
		

}
	
	/**
	 * a method for retrieving the x-coordinates of the upper left and lower
     * right vertices of an axis-aligned bounding box of the circle in the screen coordinate
     * system (rounded to nearest integers).
     * 
     * @param The parameter a specifies the radius of the circle.
     * @return X-Coordinate of the screen coordinate system of the circle 
	 */
	
	
	
	public int[] getX() 
	{
		int[] xr = new int[] {(int)(xLocal[0]+xc), (int)(xLocal[1]+xc)};

		return xr;
	}
	
	/**
	 * a method for retrieving the y-coordinates of the upper left and lower
     * right vertices of an axis-aligned bounding box of the circle in the screen coordinate
     * system (rounded to nearest integers).
     * 
     * @param The parameter a specifies the radius of the circle.
     * @return Y-Coordinate of the screen coordinate system of the circle 
	 */
	
	public int[] getY() 
	{
        int[] yr = new int[] {(int)(yLocal[0]+yc), (int)(yLocal[1]+yc)};

		return yr;
	}
}