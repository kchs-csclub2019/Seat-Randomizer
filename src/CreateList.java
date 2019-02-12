import java.io.*;

public class CreateList
{
	public CreateList(String[] names, String c) throws IOException
	{
		// Creates a new .dat
		File myFile = new File(c + ".dat");
		myFile.createNewFile();

		// It's much easier to have a int at the beginning of a .dat
		// which says how many names there are in that file
		String namesInString = names.length + "\n";

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
}