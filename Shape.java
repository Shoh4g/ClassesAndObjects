import java.awt.Color;

/**
 * The Shape class is used to model general shapes. It has instance variables for storing color,
 * fill-type, orientation, screen coordinates of the center, and local coordinates of the vertices of
 * a shape. It has methods for getting the screen coordinates of the vertices of a shape. Below is
 * a detailed description for the Shape class.
 * 
 * @author SHOHAG
 * @version 1.2
 */


public class Shape {
    /**
     * Color variable specifying the color of the shape
     * 
     * @see color	
     */
	
	public Color color;
	/**
     * a boolean value specifying whether the shape is filled or not filled.
     * 
     * @see filled
     */
	
	public boolean filled;
	/**
     * a double value specifying the orientation (in radians) of the shape in the
     * screen coordinate system
     * 
     * @see theta
     */
	
	
	public double theta;
	
	/**
     * a double value specifying the x-coordinate of the center of the shape in the
     * screen coordinate system
     * 
     * @see xc	
     */
	
	
	public double xc;
	
	/**
     * a double value specifying the y-coordinate of the center of the shape in the
     * screen coordinate system.
     * 
     * @see yc	
     */
	
	
	public double yc;
	
	/**
     * an array of double values specifying the x-coordinates of the
     * vertices (in counter-clockwise order) of the shape in its local coordinate system.
     * 
     * @see xLocal	
     */
	
	
	public double[] xLocal;
	
	/**
     * n array of double values specifying the y-coordinates of the
     * vertices (in counter- clockwise order) of the shape in its local coordinate system.
     * 
     * @see yLocal	
     */
	
	
	public double[] yLocal;
	
	
	
	/**
	 * This method is for setting the local coordinates of the
     * vertices of a shape. This is a dummy method and is supposed to be overridden in the
     * subclasses.
     * 
	 * @param size 
	 */
	
	public void setVertices(double size) {
	// to be overridden by the sub-class
	}
	
	/**
	 * a method for translating the center of the
     * shape by dx and dy, respectively, along the x and y directions of the screen coordinate
     * system.
     *
	 * @param dx the value that should be added to xc.
	 * @param dy the value that should be added to yc.
	 */
	
	public void translate(double dx, double dy) {
		this.xc+=dx;
		this.yc+=dy;
	}
	
	/**
	 * a method for rotating the shape about its center by an angle
     * of dt (in radians).
     *  
	 * @param dt value added to theta.
	 */
    
	public void rotate(double dt) 
	{
		this.theta += dt;		
	}
	
	/**
	 * a method for retrieving the x-coordinates of the vertices (in counterclockwise
     * order) of the shape in the screen coordinate system (rounded to nearest
     * integers).
     * 
	 * @return x-coordinates of the vertices.
	 */
	
	public int[] getX() 
	{
		int[] xr = new int[xLocal.length];
		double cosTheta = Math.cos(theta);
		double sinTheta = Math.sin(theta);
		for (int i=0; i< xLocal.length; i++) {
			
			xr[i]=(int)Math.round(xLocal[i]*cosTheta-yLocal[i]*sinTheta+xc);
		}
		return xr;
		
	}
	
	/**
	 * a method for retrieving the y-coordinates of the vertices (in counterclockwise
     * order) of the shape in the screen coordinate system (rounded to nearest
     * integers).
     * 
	 * @return y-coordinates of the vertices.
	 */
	
	
	
	public int[] getY() 
	{
		int[] yr = new int[yLocal.length];
		double cosTheta = Math.cos(theta);
		double sinTheta = Math.sin(theta);
		for (int i=0; i< yLocal.length; i++) {
			
			yr[i]=(int)Math.round(xLocal[i]*sinTheta+yLocal[i]*cosTheta+yc);
		}
		return yr;
		
	}
	

}
