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
     * @param x
     * @param y
     * @param width
     * @param height
     * call the arrangeCorners  method to arrange the corners
     * @return the data for each rectangle
     * 
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
     * @param no param, just a method to arrange the corners
     * @return no return
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
     * @param no param, just getters
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
     * @param no param, just an output method for display all the params
     * @return the output
     */
    public String toString()
    {
        return "Rectangle: x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", " + "Corners: " + corners[0] + ", " + corners[1] + ", " + corners[2] + ", " + corners[3];
    }


}
