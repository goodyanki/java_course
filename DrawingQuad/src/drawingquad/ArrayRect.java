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
    private boolean sortByWidth;

    
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
        return data[i];
    }
    

    public void drawArray(Graphics g) 
    {
        int startX = 300; 
        int startY = 250; 
        int gap = 10; 

        for (int i = 0; i < size; i++) 
        {
            Rectangle rect = data[i];
            data[i].moveTo(startX, startY); 
            data[i].draw(g); 

            startX += rect.getWidth() + gap;
        }
    }   
    
    public void setSortByWidth(boolean sortByWidth) 
    {
       this.sortByWidth = sortByWidth;
    }
    
     public void selectionSort(boolean descending) 
     {
        for (int i = 0; i < size - 1; i++) 
        {
            boolean comparisonResult;
            int indexToSwap = i;
            for (int j = i + 1; j < size; j++) 
            {
                if (sortByWidth == true)
                {
                    comparisonResult = data[j].getWidth() < data[indexToSwap].getWidth();
                }
                else
                {
                    comparisonResult = data[j].getHeight() < data[indexToSwap].getHeight();
                }
                int compare = data[j].compareTo(data[indexToSwap]);
                
                if (descending == true)
                {
                    comparisonResult = !comparisonResult;
                }

                if (comparisonResult == true)
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

