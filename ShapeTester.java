import java.awt.Color;
public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating a shape object
		Shape shape = new Shape();
		
		/**
	     * Color variable specifying the color of the shape
	     * 
	     * @see color	
	     */
		shape.color = new Color(250, 0, 0);
		System.out.println("The color is "+shape.color);
		
		/**
	     * a boolean value specifying whether the shape is filled or not filled.
	     * 
	     * @see filled
	     */
		shape.filled = true;
		
		/**
	     * a double value specifying the orientation (in radians) of the shape in the
	     * screen coordinate system
	     * 
	     * @see theta
	     */
		
		shape.theta = 10;
		
		System.out.println("The theta is "+shape.theta);
		
		/**
	     * a double value specifying the x-coordinate of the center of the shape in the
	     * screen coordinate system
	     * 
	     * @see xc	
	     */
	
		shape.xc = 5;
		
		System.out.println("The X-Coordinate of the square's center is "+shape.xc);
		
		/**
	     * a double value specifying the y-coordinate of the center of the shape in the
	     * screen coordinate system.
	     * 
	     * @see yc	
	     */
		
		shape.yc = 5;
		
		System.out.println("The Y-Coordinate of the square's center is "+shape.yc);
		
		/**
	     * an array of double values specifying the x-coordinates of the
	     * vertices (in counter-clockwise order) of the shape in its local coordinate system.
	     * 
	     * @see xLocal	
	     */
		
		shape.xLocal = new double[] {5,5};
		
		/**
	     * n array of double values specifying the y-coordinates of the
	     * vertices (in counter- clockwise order) of the shape in its local coordinate system.
	     * 
	     * @see yLocal	
	     */	
		shape.yLocal = new double[] {5,5};
		
		/**
		 * a method for translating the center of the
	     * shape by dx and dy, respectively, along the x and y directions of the screen coordinate
	     * system.
	     *
		 * @param dx the value that should be added to xc.
		 * @param dy the value that should be added to yc.
		 */
		
		
		shape.translate(100, 100);
		
		System.out.println("Translated coordinates xc and yc are " + shape.xc + "and" + shape.yc );
		
		/**
		 * This method is for setting the local coordinates of the
	     * vertices of a shape. This is a dummy method and is supposed to be overridden in the
	     * subclasses.
	     * 
		 * @param size 
		 */
		shape.setVertices(50);
		
		/**
		 * a method for rotating the shape about its center by an angle
	     * of dt (in radians).
	     *  
		 * @param dt value added to theta.
		 */
		shape.rotate(50);
		
		System.out.println("Theta is "+ shape.theta);
		
		/**
		 * a method for retrieving the x-coordinates of the vertices (in counterclockwise
	     * order) of the shape in the screen coordinate system (rounded to nearest
	     * integers).
	     * 
		 * @return x-coordinates of the vertices.
		 */
		
		shape.getX();
		
		System.out.println("shape's vertices in local X-coordinate system are: ");
		for(int i = 0; i < shape.xLocal.length; i++)
		System.out.println(shape.getX()[i]);
		
		
		
		/**
		 * a method for retrieving the y-coordinates of the vertices (in counterclockwise
	     * order) of the shape in the screen coordinate system (rounded to nearest
	     * integers).
	     * 
		 * @return y-coordinates of the vertices.
		 */
		
		
		shape.getY();
		
		System.out.println("shape's vertices in local X-coordinate system are: ");
		for(int i = 0; i < shape.yLocal.length; i++)
		System.out.println(shape.getY()[i]);
		
	}

}
