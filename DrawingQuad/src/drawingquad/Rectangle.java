
/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to
change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
template
*/
package drawingquad;
/**
*
* @author Yanqi Yang
* This class is used to represent a rectangle shape and can be drawn on a GUI
component.
*/
public class Rectangle extends Quadrilateral implements Comparable<Rectangle>
{
/**
* The width and height of the rectangle.
*/
    private int width;
    private int height;
    boolean sortedByWidth;
/**
* <p>
*a method that receives the x and y positions of the upper left corner of the
rectangle, then updates the value of each point from the array points depending on
the values of x, y, width and height.
* <p>
* @param x
* @param y
*/
    public void moveTo(int x, int y)
    {
        points[0] = new Point(x, y);
        points[1] = new Point(x + width, y);
        points[2] = new Point(x + width, y + height);
        points[3] = new Point(x, y + height);
    }
/**
* a method that centers the rectangle around the coordinates (525, 425)
*/
    private void center()
    {
        int leftX = 525 - width / 2;
        int topY = 425 - height / 2;
        moveTo(leftX, topY);
    }
/**
* Constructs a new rectangle with the specified width and height.
* @param width
* @param height
*/
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
        center();
    }
/**
 * <p> 
 * just getters fro width, height and area
 * <p>
 * 
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

    public int getArea()
    {
        return height * width;
    }
    
    public void setSortedByWidth(boolean sort)
    {
        this.sortedByWidth = sort;
    }
    /**
     * compare to method which returns depends on the comparison result
     * @param o
     * @return 
     */
    public int compareTo(Rectangle o)
    {
        if (sortedByWidth == true)
        {
            return compareWidth(o);
        }
        else
        {
            return compareHeight(o);
        }
    }
    
/**
 * compare two rectangles width
 * @param o
 * @return 
 */
    public int compareWidth(Rectangle o)
    {
        if (getWidth() < o.getWidth())
        {
            return 1;
        }
        else if(getWidth() > o.getWidth() )
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    /**
 * compare two rectangles heights
     * @param o
     * @return 
     */
    public int compareHeight(Rectangle o) 
    {

        if (getHeight() < o.getHeight())
        {
            return -1;
        }
        else if(getHeight() > o.getHeight() )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
