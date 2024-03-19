public class assignment07 
{
    public static void main(String[] args)
    {
        Person person1 = new Person('S',1, "Alice", "Anderson");
        Person person2 = new Person('S', 1, "Alice", "Anderson");
        Person person3 = new Person('E', 3, "Bob", "Barker"); 
               
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));
        System.out.println("person2 equals person3: " + person2.equals(person3));

        System.out.println("person1 compareTo person2: " + person1.compareTo(person2));
        System.out.println("person1 compareTo person3: " + person1.compareTo(person3));
        System.out.println("person2 compareTo person3: " + person2.compareTo(person3));


    }
}
