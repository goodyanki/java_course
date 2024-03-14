
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package drawingquad;

/**
* @author Yanqi Yang
* Point class is a class that represents a point. It has two data fields: x and y.
*/
public class Point
{
    /**
    * Here are 2 data fields for the Point class.
    */ 
    public int x;
    public int y;

    /**
    * Here are 2 constructors for the Point class.
    */ 
    public Point()
    { 
        this(0, 0); // Fixed syntax error
    }

    /**
    * @param x shows the x value of the point；
    * @param y shows the y value of the point;
    * @return the constructor does not return anything
    */ 
    public Point(int x, int y) // Fixed syntax error
    { 
        this.x = x;
        this.y = y;
    }

    /**
    * @return the x-coordinate of this point
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
    * This method is used to move the point to a new location.
    *</p>
    * @param newX shows the new x value of the point；
    * @param newY shows the new y value of the point;
    * @return the method does not return anything but updates the point's coordinates
    */ 
    public void moveTo(int newX, int newY) // Fixed syntax error
    { 
        this.x = newX;
        this.y = newY;
    }

    /**
    *<p>
    * This method is used to display the data for each point.
    * </p>
    * @return the string representation of this point
    */ 
    public String toString()
    { 
        return "Point(x=" + x + ", y=" + y + ")"; // Improved readability
    }
}
