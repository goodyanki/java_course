import java.util.logging.FileHandler;

public class Assignment05 
{
    public static void main(String[] args) 
    {
        //testers for the Fan class
        Fan fan1 = new Fan(3, true, 10, "yellow");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(7);
        fan2.setColor("Red");
        System.out.println(fan2.toString());


        //testers for the Car class
        Car car = new Car("TOYOTA", "model1", 2021, 2000.0);
        System.out.println(car.toString());

        Car car_1 = new Car("HONDA", "model2", 2020, 1500.0);
        System.out.println(car.toString());

        //testers for the Point class
        Point point = new Point(1,2);
        Point point1 = new Point(2, 4);
        Point point2 = new Point(3, 6);
        Point point3 = new Point(4, 8);

        System.out.println(point.toString());
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println(point3.toString());


        //testers for the rectangle class
        Rectangle rectangle = new Rectangle(10, 20, 100, 200);
        System.out.println(rectangle.toString());

        Rectangle rectangle_1 = new Rectangle(30, 50, 20, 100);
        System.out.println(rectangle.toString());
  
    }

    


}