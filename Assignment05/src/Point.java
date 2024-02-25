public class Point
{
    private int x;
    private int y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;

    }

    public int getY()
    {
        return y;
    }

    public void moveTo(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }

    public String toString()
    {
        return "Point(x=" + x + ", y=" + y + ")";
    }
}
