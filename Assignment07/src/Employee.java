import java.io.*;
import java.util.Scanner;
public class Employee extends Person implements FileIO
{
    private String department;
    
    public Employee()
    {
        personType = EMPLOYEE;
        ID = 0;
        firstName = "";
        lastName = "";
        department = "";
    }

    public Employee(int id, String firstName, String lastName, String department) 
    {
        super('S', id, firstName, lastName); 
        this.department = department;
        this.setOrderBy(Person.OrderBy.LAST_NAME); 
    }

    public String getdepartment() 
    {
        return department;
    }

    public String setdepartment(String department) 
    {
        return this.department = department;
    }

    public String toString()
    {
        return super.toString() + "    " + department;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (o == this) return true;
        if (!(o instanceof Employee)) return false;
        Employee other = (Employee) o;
        return this.ID == other.ID && this.department.equals(other.department);
    }

    @Override
    public int compareTo(Person other) 
    {
        if (this.sortOrder == OrderBy.DEPARTMENT  && other instanceof Employee) 
        {
            return this.department.compareTo(((Employee) other).department);
        } 
        else 
        {
            return super.compareTo(other);
        }
    }

    @Override
    public void setInfo(String info) 
    {
        String[] arr = info.split("\t");
        if (arr.length >= 4) 
        {
            this.personType = arr[0].charAt(0);
            this.ID = Integer.parseInt(arr[1]);
            this.firstName = arr[2];
            this.lastName = arr[3];
            if (arr.length > 4) 
            {
                this.department = arr[4];
            } 
            else 
            {
                this.department = "";
            }
        }
    }


    @Override
    public void saveFile(String fileName) throws FileNotFoundException 
    {
        try (PrintWriter out = new PrintWriter(fileName)) 
        {
            out.println(this.toString());
        }
    }

    @Override
    public void loadFile(String fileName) throws FileNotFoundException 
    {
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)) 
        {
            if (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine();
                setInfo(line);
            }
        } 
        catch (IOException e) 
        {
            throw new FileNotFoundException("File not found: " + fileName);
        }
    }






}

