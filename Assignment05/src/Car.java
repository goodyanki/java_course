public class Car
{

    private String brand;
    private String model;
    private int year;
    private double weight;

    public Car(String brand, String model, int year, double weight)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.weight = weight;

    }

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


    public String toString()
    {
            return "Brand: " + brand + ", model: " + model + ", year: " + year + ", weight: " + weight;
    }

}
