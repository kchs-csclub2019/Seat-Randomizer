import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteList
{
	public DeleteList(String list) throws IOException
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
