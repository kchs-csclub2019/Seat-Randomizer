import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassManager
{
	private String className;

	public ClassManager()
	{

	}

	public void setClassName(String s)
	{
		className = s;
	}

	public ArrayList<String> getClassList() throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(className + ".dat"));

		ArrayList<String> array = new ArrayList<String>();

		while(file.hasNextLine())
		{
			array.add(file.nextLine());
		}

		return array;
	}
}
