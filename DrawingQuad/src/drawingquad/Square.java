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
* just inherits from Rectangle in case it is square
*/
public class Square extends Rectangle
{
/**
* Constructs the square with the arg side that all the 4 sides' length are
equal
* @param side
*/
    public Square(int side)
    {
        super(side, side);
    }
}
