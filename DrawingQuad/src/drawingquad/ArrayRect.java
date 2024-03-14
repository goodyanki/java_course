/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingquad;

/**
 *
 * @author Yanqi
 */
public class ArrayRect 
{
    private Rectangle[] data;
    private int capacity;
    private int size;
    
    public ArrayRect(int capacity) 
    {
        this.capacity = capacity;
        this.data = new Rectangle[capacity];
        this.size = 0;
    }
    
    public ArrayRect()
    {
        this(5);
    }
    
    
    public boolean add(Rectangle r) 
    {
        if (size < capacity) 
        {
            data[size] = r;
            size++;
            return true;
        } 
        else 
        {
            return false;
        }
    }
    
    public Rectangle rectAt(int i) 
    {
        if (i < 0 || i >= size) 
        {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return data[i];
    }
}
