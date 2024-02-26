/**
 * @author Yanqi Yang
 * Rectangle class is a class that represents a rectangle. It has four data fields: width, height, x, and y.
 */
public class Rectangle
{   
    /**
     * Here are 4 data fields for the Rectangle class.
     */
    private int width;
    private int height;
    private int x;
    private int y;
    private Point[] corners;

    /**
     * Here is a constructor for the Rectangle class.
     * @param x                     shows the x value of the rectangle；
     * @param y                     shows the y value of the rectangle；
     * @param width                 shows the width of the rectangle；
     * @param height                shows the height of the rectangle；
     * call the arrangeCorners  method to arrange the corners
     * @return                      constructor do not return anything
     */

    public Rectangle(int x, int y, int width, int height) 
    {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.corners = new Point[4];
        arrangeCorners();
    }

    /**
     * <p>
     *     no params
     *     This method is used to arrange the corners of the rectangle.
     * </p>
     * @return              do not return anything
     * 
     */
    public void arrangeCorners()
    {
        corners[0] = new Point(0, 0);
        corners[1] = new Point(width, 0);
        corners[2] = new Point(0, height);
        corners[3] = new Point(width, height);
    }

    /**
     * <p>
     *     no params, just getters
     * </p>
     * @return
     */
    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Point[] getCorners() 
    {
        return corners;
    }

    /**
     * <p>
     *     no params
     *     This method is used to get the data for each rectangle.
     * </p>
     * @return the output
     */
    public String toString()
    {
        return "Rectangle: x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", " + "Corners: " + corners[0] + ", " + corners[1] + ", " + corners[2] + ", " + corners[3];
    }


}
