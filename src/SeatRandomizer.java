import java.io.IOException;
import java.util.Arrays;

public class SeatRandomizer
{
    public static void main(String[] args) throws IOException
    {
        GUISetup window = new GUISetup();
	    window.makeTheWindow();
	    window.setVisible(true);

        String[] nameList = {"Jeongwoo Choi", "Richard Noh"};

        CreateList test = new CreateList("test");
        new AddToList(nameList, "test");

        ReadList finalArray = new ReadList("test");
	    System.out.println(Arrays.toString(finalArray.getClassList()));

//	    new DeleteList("test");
    }
}
