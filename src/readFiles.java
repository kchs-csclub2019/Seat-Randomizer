public class readFiles
{
	private String className;
	private Scanner file;
	public readFiles
	{
		
	}
	
	public readFiles(String s)
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
