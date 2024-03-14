/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingquad;
import java.awt.Graphics;
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
    

    public void drawArray(Graphics g) 
    {
        int startX = 60; 
        int startY = 350; 
        int gap = 10; 

        for (int i = 0; i < size; i++) 
        {
            Rectangle rect = data[i];
            data[i].moveTo(startX, startY); 
            data[i].draw(g); 

            startX += rect.getWidth() + gap;
        }
    }   
    
    
    public void selectionSort(boolean descending, boolean sortByWidth) 
    {
        for (int i = 0; i < size - 1; i++) 
        {
            int indexToSwap = i;
            for (int j = i + 1; j < size; j++) 
            {
                boolean comparisonResult;
                if (sortByWidth) 
                {
                    comparisonResult = (data[j].getWidth() < data[indexToSwap].getWidth());
                } 
                else 
                {
                    comparisonResult = (data[j].getHeight() < data[indexToSwap].getHeight());
                }
                if (descending) 
                {
                    comparisonResult = !comparisonResult;
                }
                if (comparisonResult) 
                {
                    indexToSwap = j;
                }
            }
            if (indexToSwap != i) 
            {
                Rectangle temp = data[indexToSwap];
                data[indexToSwap] = data[i];
                data[i] = temp;
            }
        }
    }

}
