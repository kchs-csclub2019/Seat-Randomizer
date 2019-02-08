import java.io.File;
import java.io.IOException;

public class CreateList
{
	public CreateList(String c) throws IOException
	{
		// Creates a new .dat
		File myFile = new File(c + ".dat");
		myFile.createNewFile();
	}
}