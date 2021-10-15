import java.awt.Color;

public class CircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating a circle object
		Circle circle = new Circle();
		/**
	     * Color variable specifying the color of the circle
	     * 
	     * @see color	
	     */
		
		circle.color = new Color(0, 250, 0);
		
		System.out.println("The color is "+circle.color);
		
		
		/**
	     * a boolean value specifying whether the circle is filled or not filled.
	     * 
	     * @see filled
	     */
		circle.filled = true;
		
		/**
	     * a double value specifying the orientation (in radians) of the circle in the
	     * screen coordinate system
	     * 
	     * @see theta
	     */
		
		circle.theta = 0;
		System.out.println("The theta is "+circle.theta);
		
		/**
	     * a double value specifying the x-coordinate of the center of the circle in the
	     * screen coordinate system
	     * 
	     * @see xc	
	     */
		
		circle.xc = 0;
		
		System.out.println("The X-Coordinate of the circle's center is "+circle.xc);
		
		/**
	     * a double value specifying the y-coordinate of the center of the circle in the
	     * screen coordinate system.
	     * 
	     * @see yc	
	     */
		
		
		circle.yc = 0;
		
		System.out.println("The Y-Coordinate of the circle's center is "+circle.yc);
		
		/**
		 * a method for translating the center of the
	     * circle by dx and dy, respectively, along the x and y directions of the screen coordinate
	     * system.
	     *
		 * @param dx the value that should be added to xc.
		 * @param dy the value that should be added to yc.
		 */		
		circle.translate(250, 100);
		
		System.out.println("Translated coordinates xc and yc are " + circle.xc + "and" + circle.yc );
		
		/**
		 * This method is for setting the local coordinates of the
	     * vertices of a circle. This is a dummy method and is supposed to be overridden in the
	     * subclasses.
	     * 
		 * @param size 
		 */
		
		circle.setVertices(50);
		System.out.println("circle's vertices in local coordinate system are: ");
		for(int i = 0; i < circle.xLocal.length; i++)
		System.out.println("vertex" + (i+1) +" : x = " + circle.xLocal[i] + ", y = " + circle.yLocal[i]);
		
		/**
		 * a method for rotating the circle about its center by an angle
	     * of dt (in radians).
	     *  
		 * @param dt value added to theta.
		 */
		
		circle.rotate(50);
		
		System.out.println("Theta is "+ circle.theta);
		
		
		/**
		 * a method for retrieving the x-coordinates of the vertices (in counterclockwise
	     * order) of the circle in the screen coordinate system (rounded to nearest
	     * integers).
	     * 
		 * @return x-coordinates of the vertices.
		 */
		
		circle.getX();
		
		System.out.println("circle's vertices in local X-coordinate system are: ");
		for(int i = 0; i < circle.xLocal.length; i++)
		System.out.println(circle.getX()[i]);
		
		
		/**
		 * a method for retrieving the y-coordinates of the vertices (in counterclockwise
	     * order) of the circle in the screen coordinate system (rounded to nearest
	     * integers).
	     * 
		 * @return y-coordinates of the vertices.
		 */
		circle.getY();		
		
		System.out.println("circle's vertices in local Y-coordinate system are: ");
		for(int i = 0; i < circle.yLocal.length; i++)
		System.out.println(circle.getY()[i]);
		

	}

}
