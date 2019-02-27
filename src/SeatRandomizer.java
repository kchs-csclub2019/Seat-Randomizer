import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class SeatRandomizer
{
    public static void main(String[] args) throws IOException
    {
    	ClassManager manager = new ClassManager();
    	manager.setClassName("Period 2B");

	    ArrayList<Student> names = new ArrayList<Student>();
//	    manager.createClassFile(names);

	    System.out.println(manager.readClassFile());

    	names.clear();
    	names.add(new Student("Jeongwoo Choi"));
    	names.add(new Student("Richard Noh"));
	    manager.addToClassFile(names);
	    System.out.println(manager.readClassFile());
    }
}

class Student
{
	private String name;
	private int age;
	private int id;
	private int gradeLevel;
	private int gradeAverage;

	public Student()
	{
	}

	public Student(String s)
	{
		name = s;
	}

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}

	public void setAge(int num)
	{
		age = num;
	}

	public int getAge()
	{
		return age;
	}

	public void setId(int num)
	{
		id = num;
	}

	public int getId()
	{
		return id;
	}

	public void setGradeLevel(int num)
	{
		gradeLevel = num;
	}

	public int getGradeLevel()
	{
		return gradeLevel;
	}

	public void setGradeAverage(int num)
	{
		gradeAverage = num;
	}

	public int getGradeAverage()
	{
		return gradeAverage;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
