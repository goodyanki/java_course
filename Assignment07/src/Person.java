public abstract class Person implements Comparable<Person>
//public class Person implements Comparable<Person>
{
    public static final char PERSON = 'P'; 
    public static final char EMPLOYEE = 'E';
    public static final char STUDENT = 'S';

    protected char personType;
    protected int ID;
    protected String firstName;
    protected String lastName;
    protected OrderBy sortOrder;  

    public enum OrderBy 
    {
        TYPE, ID, FIRST_NAME, LAST_NAME, DEPARTMENT, MAJOR;
    }

    public Person()
    {
        personType = PERSON;
        ID = 0;
        firstName = "";
        lastName = "";
        sortOrder = OrderBy.LAST_NAME;
    }

    
    public Person(char personType, int ID, String firstName, String lastName)
    {
        this.personType = personType;
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sortOrder = OrderBy.LAST_NAME;
    }


    public char getPersonType() 
    {
        return personType;
    }

    public int getID() 
    {
        return ID;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setOrderBy(OrderBy newOrder) {
        this.sortOrder = newOrder;
    }

    @Override
    public String toString()
    {
        return "Person [ID" + ID + ", firstName= " + firstName + ", lastName= " + lastName + "]";
    }


    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || !(o instanceof Person)) return false;
        Person person = (Person) o;
        return personType == person.personType && ID == person.ID && firstName == person.firstName && lastName == person.lastName;
    }


    @Override
    public int compareTo(Person person) 
    {
        switch(this.sortOrder)
        {            
            case TYPE:
                return personType - person.personType;
            case ID:
                return ID - person.ID;
            case FIRST_NAME:
                return firstName.compareTo(person.firstName);
            case LAST_NAME:
                return lastName.compareTo(person.lastName);
            default:
                return 0;
        }
    }

    public abstract void setInfo(String info);


}
