/**
 * @author Yanqi Yang
 * Point class is a class that represents a point. It has two data fields: x and y.
 
 */
public class Point
{
    /**
     * Here are 2 data fields for the Point class.
     */
    private int x;
    private int y;

    /**
     * Here are 2 constructors for the Point class.
     */
    public Point()
    {
        x = 0;
        y = 0;
    }

    /**
     * @param x                     shows the x value of the point；
     * @param y                     shows the y value of the point;
     * @return                      the constructor do not return anything
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the data for each point
     */
    public int getX()
    {
        return x;

    }

    public int getY()
    {
        return y;
    }

    /**
     *<p>
     *     This method is used to move the point to a new location.
     *</p>
     * @param newX          shows the new x value of the point；
     * @param newY          shows the new y value of the point;
     * @return              the new data for each point

     */
    public void moveTo(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }

    /**
     *<p>
     *no params
     *This method is used to display the data for each point.
     * </p>
     * @return              the output
     */
    public String toString()
    {
        return "Point(x=" + x + ", y=" + y + ")";
    }
}
