/**
 * @author Yanqi Yang
 * Fan class is a class that represents a fan. It has four data fields: speed, on, radius, and color.
 */

public class Fan
{
    /**
     * Here are 3 constants for the speed of the fan.
     */
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    /**
     * Here are 4 data fields for the Fan class.
     */
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Here are 2 constructors for the Fan class.
     */
    public Fan() 
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) 
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * @param no param, just setters and getters
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
     * @param no param
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
