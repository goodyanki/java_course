public class assignment07 
{
    public static void main(String[] args)
    {
        Person person1 = new Person('S',1, "Alice", "Anderson");
        Person person2 = new Person('P', 2, "Alice", "Anderson");
        Person person3 = new Person('E', 3, "Bob", "Anderson"); 
               
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));
        System.out.println("person2 equals person3: " + person2.equals(person3));

        System.out.println("person1 compareTo person2: " + person1.compareTo(person2));
        System.out.println("person1 compareTo person3: " + person1.compareTo(person3));
        System.out.println("person2 compareTo person3: " + person2.compareTo(person3));

        person1.setOrderBy(Person.OrderBy.FIRST_NAME);
        System.out.println("person1 compareTo person3: " + person1.compareTo(person3));
        System.out.println("person1 compareTo person2: " + person1.compareTo(person2));

        person3.setOrderBy(Person.OrderBy.ID);
        System.out.println("person3 compareTo person1: " + person3.compareTo(person1));

        person2.setOrderBy(Person.OrderBy.TYPE);
        System.out.println("person2 compareTo person3: " + person2.compareTo(person3));

        person1.setOrderBy(Person.OrderBy.LAST_NAME);
        System.out.println("person1 compareTo person3: " + person1.compareTo(person3));



    }
}
