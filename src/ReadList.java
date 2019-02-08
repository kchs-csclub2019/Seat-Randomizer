import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadList
{
	private String className;

	public ReadList(String s)
	{
		setClassName(s);
	}

	// Sets the parameter into a variable
	public void setClassName(String s)
	{
		className = s;
	}

	// This returns a array of a list of students from the .dat file
	public String[] getClassList() throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(className + ".dat"));

		int arraySize = Integer.parseInt(file.nextLine());

		String[] array = new String[arraySize];

		for (int i = 0; i < arraySize; i++)
		{
			array[i] = file.nextLine();
		}

		return array;
	}
}
