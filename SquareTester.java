import java.awt.Color;

public class SquareTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // creating a square object 
		Square square = new Square();
		/**
	     * Color variable specifying the color of the square
	     * 
	     * @see color	
	     */
		square.color = new Color(250, 0, 0);
		System.out.println("The color is "+square.color);
		
		/**
	     * a boolean value specifying whether the square is filled or not filled.
	     * 
	     * @see filled
	     */
		square.filled = true;
		
		/**
	     * a double value specifying the orientation (in radians) of the square in the
	     * screen coordinate system
	     * 
	     * @see theta
	     */
		square.theta = -Math.PI / 2;
		
		System.out.println("The theta is "+square.theta);
		
		/**
	     * a double value specifying the x-coordinate of the center of the square in the
	     * screen coordinate system
	     * 
	     * @see xc	
	     */
		
		square.xc = 5;
		System.out.println("The X-Coordinate of the square's center is "+square.xc);
		/**
	     * a double value specifying the y-coordinate of the center of the square in the
	     * screen coordinate system.
	     * 
	     * @see yc	
	     */
		
		square.yc = 5;
		
		System.out.println("The Y-Coordinate of the square's center is "+square.yc);
		
		/**
		 * a method for translating the center of the
	     * square by dx and dy, respectively, along the x and y directions of the screen coordinate
	     * system.
	     *
		 * @param dx the value that should be added to xc.
		 * @param dy the value that should be added to yc.
		 * 
		 */	
		
		
		square.translate(100, 100);
		System.out.println("Translated coordinates xc and yc are " + square.xc + "and" + square.yc );
		
		/**
		 * This method is for setting the local coordinates of the
	     * vertices of a square. This is a dummy method and is supposed to be overridden in the
	     * subclasses.
	     * 
		 * @param size 
		 */
		
		
		square.setVertices(50);
		
		System.out.println("square's vertices in local coordinate system are: ");
		for(int i = 0; i < square.xLocal.length; i++)
		System.out.println("vertex" + (i+1) +" : x = " + square.xLocal[i] + ", y = " + square.yLocal[i]);
		
		
		
		
		/**
		 * a method for rotating the square about its center by an angle
	     * of dt (in radians).
	     *  
		 * @param dt value added to theta.
		 */
		
		square.rotate(50);
		
		System.out.println("Theta is "+ square.theta);
		
		/**
		 * a method for retrieving the x-coordinates of the vertices (in counterclockwise
	     * order) of the square in the screen coordinate system (rounded to nearest
	     * integers).
	     * 
		 * @return x-coordinates of the vertices.
		 */
		square.getX();
		System.out.println("square's vertices in local X-coordinate system are: ");
		for(int i = 0; i < square.xLocal.length; i++)
		System.out.println(square.getX()[i]);
		/**
		 * a method for retrieving the y-coordinates of the vertices (in counterclockwise
	     * order) of the square in the screen coordinate system (rounded to nearest
	     * integers).
	     * 
		 * @return y-coordinates of the vertices.
		 */
		
		
		square.getY();
		
		System.out.println("square's vertices in local Y-coordinate system are: ");
		for(int i = 0; i < square.yLocal.length; i++)
		System.out.println(square.getY()[i]);
		
	}

}
