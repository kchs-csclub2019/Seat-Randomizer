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

	public void setClassName(String s)
	{
		className = s;
	}

	public ArrayList<String> readClassFile() throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(className + ".dat"));

		ArrayList<String> array = new ArrayList<String>();

		while(file.hasNextLine())
		{
			array.add(file.nextLine());
		}

		return array;
	}

	public void createClassFile(String[] names, String c) throws IOException
	{
		// Creates a new .dat
		File myFile = new File(c + ".dat");
		myFile.createNewFile();

		// It's much easier to have a int at the beginning of a .dat
		// which says how many names there are in that file
		String namesInString = "";

		// Adds all the names from the array into a string
		for (int i = 0; i < names.length; i++)
		{
			namesInString += names[i] + "\n";
		}

		// Line of code from the internet
		try (
				PrintWriter outWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(c + ".dat")))))
		{
			// Basically tells "outWriter" to add "namesInString" which is the list of names
			outWriter.print(namesInString);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void addToClassFile(String[] names, String c) throws IOException
	{
		// It's much easier to have a int at the beginning of a .dat
		// which says how many names there are in that file
		String namesInString = names.length + "\n";

		// Adds all the names from the array into a string
		for (int i = 0; i < names.length; i++)
		{
			namesInString += names[i] + "\n";
		}

		// Line of code from the internet
		try (PrintWriter outWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(c + ".dat")))))
		{
			// Basically tells "outWriter" to add "namesInString" which is the list of names
			outWriter.print(namesInString);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void deleteClassFile(String list) throws IOException
	{
		// Finds the path of the .dat file
		Path p = Paths.get(list + ".dat");

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
