
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
public class Rectangle extends Quadrilateral
{
/**
* The width and height of the rectangle.
*/
    private int width;
    private int height;
/**
* <p>
*a method that receives the x and y positions of the upper left corner of the
rectangle, then updates the value of each point from the array points depending on
the values of x, y, width and height.
* <p>
* @param x
* @param y
*/
    private void moveTo(int x, int y)
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
}
