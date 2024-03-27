import java.io.FileNotFoundException;


public class assignment07 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        /* 
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
*/
        Student student1 = new Student(1, "Alice", "Anderson", "Biology");
        Student student2 = new Student(2, "Bob", "Brown", "Chemistry");
        Student student3 = new Student(3, "Charlie", "Clark", "Physics");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


        student1.saveFile("student1.txt");
        student2.saveFile("student2.txt");
        student3.saveFile("student3.txt");
        System.out.println("Files saved successfully.");


        Student studentFromFile = new Student();
        studentFromFile.loadFile("student1.txt");
        System.out.println("Loaded from file: " + studentFromFile);
 


        student1.setInfo("S\t4\tDiana\tDawson\tMathematics");
        System.out.println("After setInfo: " + student1);

        System.out.println("student1 equals student2: " + student1.equals(student2));

        student1.setOrderBy(Student.OrderBy.LAST_NAME);
        student2.setOrderBy(Student.OrderBy.FIRST_NAME);
        student3.setOrderBy(Student.OrderBy.ID);

        System.out.println("student1 compareTo student3: " + student1.compareTo(student3));
        System.out.println("student1 compareTo student2: " + student1.compareTo(student2));
        


    

        Employee employee1 = new Employee(1, "Alice", "Anderson", "Engineering");
        Employee employee2 = new Employee(2, "Bob", "Brown", "Accounting");
        Employee employee3 = new Employee(3, "Charlie", "Clark", "Human Resources");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


        employee1.saveFile("employee1.txt");
        employee2.saveFile("employee2.txt");
        employee3.saveFile("employee3.txt");
        System.out.println("Files saved successfully.");
        

        Employee employeeFromFile = new Employee();
        employeeFromFile.loadFile("employee1.txt");
        System.out.println("Loaded from file: " + employeeFromFile);
 


        employee1.setInfo("S\t4\tDiana\tDawson\tMathematics");
        System.out.println("After setInfo: " + employee1);

        System.out.println("employee1 equals employee2: " + employee1.equals(employee2));

        employee1.setOrderBy(Employee.OrderBy.LAST_NAME);
        employee2.setOrderBy(Employee.OrderBy.FIRST_NAME);
        employee3.setOrderBy(Employee.OrderBy.ID);

        System.out.println("Employee1 compareTo Employee3: " + employee1.compareTo(employee3));
        System.out.println("Employee1 compareTo Employee2: " + employee1.compareTo(employee2));

    }


}
