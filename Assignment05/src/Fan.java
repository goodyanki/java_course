/**
 * @author Yanqi Yang
 * Fan class is a class that represents a fan. It has four data fields: speed, on, radius, and color.
 */

public class Fan
{
    /**
     * <p>
     *     Here are 3 constants for the speed of the fan.
     * </p>
     */
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    /**
     * <p>
     *     Here are 4 data fields for the Fan class.
     * </p>
     */
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * <p>
     *     Here are 2 constructors for the Fan class.
     * </p>
     */
    public Fan() 
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    /**
     * @param speed                      shows the speed of the fan
     * @param on                         shows if the fan is on or off
     * @param radius                     shows the radius of the fan
     * @param color                      shows the color of the fan
     * @return the data for each fan
     */
    public Fan(int speed, boolean on, double radius, String color) 
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * <p>
     *     no params
     *     This method is used to get the speed of the fan.
     * </p>
     * @return the data for each fan
     */
    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean isOn()
    {
        return on;
    }

    public void setOn(boolean on)
    {
        this.on = on;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }


    /**
     * <p>
     *     no params
     *     This method is used to display the data for each fan.
     * </p>
     * @return String of the fan's speed, color, and radius if the fan is on, otherwise return a string of the fan's color and radius and a message that the fan is off.
     */
    public String toString() 
    {
        if (on) 
        {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } 
        else 
        {
            return "Fan color: " + color + ", radius: " + radius + ", fan is off";
        }
    }

    

}
