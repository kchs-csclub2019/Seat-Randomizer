import java.io.IOException;
import java.util.Arrays;

public class SeatRandomizer
{
    public static void main(String[] args) throws IOException
    {
//        GUISetup window = new GUISetup();
//	    window.makeTheWindow();
//	    window.setVisible(true);


//	    if(true)
//		{
//			String[] nameList = {"Jeongwoo Choi", "Richard Noh"};
//
//			new CreateList(nameList, "test");
//
//			ReadList finalArray = new ReadList("test");
//			System.out.println(finalArray.getClassList());
//
//		}
//		else
//		{
//			new DeleteList("test");
//		}


    }
}

class Student
{
	private String name;
	private int age;
	private int id;
	private int gradeLevel;
	private int gradeAverage;

	public static int studentCount = 0;

	public Student()
	{
		studentCount++;
	}

	public void setName(String n)
	{
		name = n;
	}

	public void setAge(int num)
	{
		age = num;
	}

	public void setId(int num)
	{
		id = num;
	}

	public void setGradeLevel(int num)
	{
		gradeLevel = num;
	}

	public void setGradeAverage(int num)
	{
		gradeAverage = num;
	}
}

class classroom
{

	public classroom()
	{

	}
}