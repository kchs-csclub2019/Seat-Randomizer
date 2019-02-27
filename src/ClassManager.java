import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassManager
{
	private String className;

	public ClassManager()
	{

	}

	public ClassManager(String name)
	{
		setClassName(name);
	}

	public void setClassName(String s)
	{
		className = s;
	}

	public void createClassFile(ArrayList<Student> names) throws IOException
	{
		// Creates a new .dat
		File myFile = new File(className + ".dat");
		myFile.createNewFile();

		String namesInString = "";
		// Adds all the names from the array into a string
		for (int i = 0; i < names.size(); i++)
		{
			namesInString += names.get(i).getName() + "\n";
		}

		// Line of code from the internet
		try (
				PrintWriter outWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(className + ".dat")))))
		{
			// Basically tells "outWriter" to add "namesInString" which is the list of names
			outWriter.print(namesInString);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void addToClassFile(ArrayList<Student> names) throws IOException
	{
		String namesInString = "";
		for (int i = 0; i < readClassFile().size(); i++)
		{
			namesInString += readClassFile().get(i).getName() + "\n";
		}

		// Adds all the names from the array into a string
		for (int i = 0; i < names.size(); i++)
		{
			namesInString += names.get(i).getName() + "\n";
		}

		// Line of code from the internet
		try (PrintWriter outWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(className + ".dat")))))
		{
			// Basically tells "outWriter" to add "namesInString" which is the list of names
			outWriter.print(namesInString);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void addToClassFile(String name) throws IOException
	{
		String namesInString = "";
		for (int i = 0; i < readClassFile().size(); i++)
		{
			namesInString += readClassFile().get(i) + "\n";
		}
		namesInString += name;

		// Line of code from the internet
		try (PrintWriter outWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(className + ".dat")))))
		{
			// Basically tells "outWriter" to add "namesInString" which is the list of names
			outWriter.print(namesInString);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public ArrayList<Student> readClassFile() throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(className + ".dat"));

		ArrayList<Student> array = new ArrayList<Student>();

		while(file.hasNextLine())
		{
			array.add(new Student(file.nextLine()));
		}

		return array;
	}

	public void deleteClassFile() throws IOException
	{
		// Finds the path of the .dat file
		Path p = Paths.get(className + ".dat");

		// If it deletes the file it returns a true
		// if it can't then it returns a false
		if(Files.deleteIfExists(p))
		{
			System.out.println("Deleted " + p);
		}
		else
		{
			System.out.println(p + " does not exist.");
		}
	}
}
