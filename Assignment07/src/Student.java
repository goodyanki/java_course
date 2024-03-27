import java.io.*;
import java.util.Scanner;
public class Student extends Person implements FileIO
{
    private String major;
    
    public Student()
    {
        personType = STUDENT;
        ID = 0;
        firstName = "";
        lastName = "";
        major = "";
    }

    public Student(int id, String firstName, String lastName, String major) 
    {
        super('S', id, firstName, lastName); 
        this.major = major;
        this.setOrderBy(Person.OrderBy.LAST_NAME); 
    }

    public String getMajor() 
    {
        return major;
    }

    public String setMajor(String major) 
    {
        return this.major = major;
    }

    public String toString()
    {
        return super.toString() + "    " + major;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (o == this) return true;
        if (!(o instanceof Student)) return false;
        Student other = (Student) o;
        return this.ID == other.ID && this.major.equals(other.major);
    }

    @Override
    public int compareTo(Person other) 
    {
        if (this.sortOrder == OrderBy.MAJOR  && other instanceof Student) 
        {
            return this.major.compareTo(((Student) other).major);
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
                this.major = arr[4];
            } 
            else 
            {
                this.major = "";
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








