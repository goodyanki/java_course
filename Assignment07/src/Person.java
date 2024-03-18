public class Person 
{
    public static final char PERSON = 'P'; 
    public static final char EMPLOYEE = 'E';
    public static final char STUDENT = 'S';

    private char personType;
    private int ID;
    private String firstName;
    private String lastName;
    private OrderBy sortOrder;


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

    @Override
    public String toString()
    {
        return "Person [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    /**
     * 
     * equals() will compare if the current object and the parameter contain the same values. This is an override method
     */
    @Override
    public int compareTo(Person o)
    {
        int result = 0;
        switch(sortOrder)
        {
            case TYPE:
                result = personType - o.personType;
                break;
            case ID:
                result = ID - o.ID;
                break;
            case FIRST_NAME:
                result = firstName.compareTo(o.firstName);
                break;
            case LAST_NAME:
                result = lastName.compareTo(o.lastName);
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
