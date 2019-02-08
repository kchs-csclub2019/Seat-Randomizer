

public class ReadFiles
{
	private String className;
	private Scanner file;
	public ReadFiles
	{
		
	}
	
	public ReadFiles(String s)
	{
		setClassName(s);
	}
	
	public void setClassName(String s)
	{
		className = s;
		file = Scanner(new File(className + ".dat"));
	}
	
	public String[] getNames
	{
		
	}
}
