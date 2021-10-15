import java.awt.Color;

public class TriangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a triangle object
		Triangle triangle = new Triangle();
		/**
	     * Color variable specifying the color of the triangle
	     * 
	     * @see color	
	     */
		triangle.color = new Color(250, 0, 0);
		System.out.println("The color is "+triangle.color);
		
		
		/**
	     * a boolean value specifying whether the triangle is filled or not filled.
	     * 
	     * @see filled
	     */
		triangle.filled = true;
		
		/**
	     * a double value specifying the orientation (in radians) of the triangle in the
	     * screen coordinate system
	     * 
	     * @see theta
	     */
		
		
		triangle.theta = -Math.PI / 2;
		System.out.println("The theta is "+triangle.theta);
		
		/**
	     * a double value specifying the x-coordinate of the center of the triangle in the
	     * screen coordinate system
	     * 
	     * @see xc	
	     */
		
		triangle.xc = 0;
		
		System.out.println("The X-Coordinate of the triangle's center is "+triangle.xc);
		
		/**
	     * a double value specifying the y-coordinate of the center of the triangle in the
	     * screen coordinate system.
	     * 
	     * @see yc	
	     */
		
		triangle.yc = 0;
		
		System.out.println("The Y-Coordinate of the triangle's center is "+triangle.yc);
		
		/**
		 * a method for translating the center of the
	     * triangle by dx and dy, respectively, along the x and y directions of the screen coordinate
	     * system.
	     *
		 * @param dx the value that should be added to xc.
		 * @param dy the value that should be added to yc.
		 */	
		
		triangle.translate(400, 100);
		System.out.println("Translated coordinates xc and yc are " + triangle.xc + "and" + triangle.yc );
		/**
		 * This method is for setting the local coordinates of the
	     * vertices of a triangle. This is a dummy method and is supposed to be overridden in the
	     * subclasses.
	     * 
		 * @param size 
		 */
		
		triangle.setVertices(50);
		System.out.println("triangle's vertices in local coordinate system are: ");
		for(int i = 0; i < triangle.xLocal.length; i++)
		System.out.println("vertex" + (i+1) +" : x = " + triangle.xLocal[i] + ", y = " + triangle.yLocal[i]);
		/**
		 * a method for rotating the triangle about its center by an angle
	     * of dt (in radians).
	     *  
		 * @param dt value added to theta.
		 */
		
		
		triangle.rotate(50);
		System.out.println("Theta is "+ triangle.theta);
		
		/**
		 * a method for retrieving the x-coordinates of the vertices (in counterclockwise
	     * order) of the triangle in the screen coordinate system (rounded to nearest
	     * integers).
	     * 
		 * @return x-coordinates of the vertices.
		 */
		
		triangle.getX();
		
		System.out.println("triangle's vertices in local X-coordinate system are: ");
		for(int i = 0; i < triangle.xLocal.length; i++)
		System.out.println(triangle.getX()[i]);
		
		/**
		 * a method for retrieving the y-coordinates of the vertices (in counterclockwise
	     * order) of the triangle in the screen coordinate system (rounded to nearest
	     * integers).
	     * 
		 * @return y-coordinates of the vertices.
		 */
		
		triangle.getY();
		
		System.out.println("triangle's vertices in local Y-coordinate system are: ");
		for(int i = 0; i < triangle.yLocal.length; i++)
		System.out.println(triangle.getY()[i]);
			

	}

}
