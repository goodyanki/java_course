/**
 * @author:  Yanqi Yang
 * Car class is a class that represents a car. It has four data fields: brand, model, year, and weight.
 */
public class Car
{

    /**
     * Here are 4 data fields for the Car class.
     */
    private String brand;
    private String model;
    private int year;
    private double weight;

    /**
     * Here is a constructor for the Car class.
     * @param brand
     * @param model
     * @param year
     * @param weight
     * @return the data for each car
     */
    public Car(String brand, String model, int year, double weight)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.weight = weight;

    }
    /**
     * @param no param, just getters
     * @return
     */
    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public double getWeight()
    {
        return weight;
    }

    /**
     * @param no param, just an output method for display all the params
     * @return the output

     */
    public String toString()
    {
            return "Brand: " + brand + ", model: " + model + ", year: " + year + ", weight: " + weight;
    }

}
