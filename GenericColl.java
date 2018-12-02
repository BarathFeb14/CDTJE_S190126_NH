package List;
import java.util.*;
public class GenericColl 
{
	public static void main(String arg[])
	{
	ArrayList list=new ArrayList<String>();
	list.add("Blaze");
	list.add("Srikanth");
	list.add("Moin");
	String str=(String) list.get(0);
	System.out.println(str);
}
}
