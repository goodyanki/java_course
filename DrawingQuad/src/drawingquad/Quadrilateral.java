
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package drawingquad;
import java.awt.Graphics;
import javax.swing.*;
/**
* The {@code Quadrilateral} class represents a four-sided polygon with random
vertices.
* Each quadrilateral has four points, which are determined randomly within a
specified range.
* This class provides methods to draw the quadrilateral on a given graphics
context.
* @author Hani
*/
public class Quadrilateral extends JPanel
{
/**
* Array of {@code Point} objects representing the vertices of the
quadrilateral.
*/
    public Point[] points;
/**
* Generates a random integer between the specified minimum and maximum range,
inclusive.
* @param min
* @param max
* @return the random value
*/
    private int random(int min, int max)
    {
        return (int) (min + Math.random() * (max - min + 1));
    }
/**
*Constructs a {@code Quadrilateral} with randomly generated vertices.
*/
    public Quadrilateral()
    {
        points = new Point[4];
        points[0] = new Point(random(50, 400), random(150, 300));
        points[1] = new Point(random(600, 1000), random(150, 300));
        points[2] = new Point(random(600, 1000), random(400, 650));
        points[3] = new Point(random(50, 400), random(400, 650));
    }
/**
* The method connects each vertex to the next, closing the shape by connecting
the last vertex to the first.
*
* @param g
*/
    public void draw(Graphics g)
    {
        for (int i = 0; i < points.length; i++)
        {
            int iNext = i + 1;
            if (iNext == points.length)
            {
                iNext = 0; // Wrap around to the start of the array
            }
            g.drawLine(points[i].x, points[i].y, points[iNext].x, points[iNext].y);
        }
    }
}
