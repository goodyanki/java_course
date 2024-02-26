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
     * @param x
     * @param y
     * @return the data for each point
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * @param no param, just getters
     * @return
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
     * @param newX
     * @param newY
     * @return the new data for each point

     */
    public void moveTo(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }

    /**
     * @param no param, just an output method for display all the params
     * @return the output
     */
    public String toString()
    {
        return "Point(x=" + x + ", y=" + y + ")";
    }
}
