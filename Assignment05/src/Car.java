/**
 * @author:  Yanqi Yang
 * Car class is a class that represents a car. It has four data fields: brand, model, year, and weight.
 */
public class Car
{

    /**
     * <p>
     *     Here are 4 data fields for the Car class.
     * </p>
     */
    private String brand;
    private String model;
    private int year;
    private double weight;

    /**
     * <p>
     *     Here is a constructor for the Car class.
     * </p>
     * @param brand                  shows the brand of the car；
     * @param model                  shows the model of the car；
     * @param year                   shows the year of the car；
     * @param weight                 shows the weight of the car；
     * @return                       constructor do not return anything
     */
    public Car(String brand, String model, int year, double weight)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.weight = weight;

    }
    /**
     * <p>
     *     just getters
     * </p>
     * @return the data for each car
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
     *<p>
     *     This method is used to get the data for each car.
     *     no params
     *</p>
     * @return the output

     */
    public String toString()
    {
            return "Brand: " + brand + ", model: " + model + ", year: " + year + ", weight: " + weight;
    }

}
