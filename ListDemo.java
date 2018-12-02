package List;
import java.util.*;

public class ListDemo 
{
public static void main(String arg[])
{
	ArrayList list=new ArrayList();
	list.add("Blaze");
	list.add("Srikanth");
	list.add("Moin");
	list.add(100);
	list.add(200);
	System.out.println(list);
	System.out.println("Size of list:"+list.size());
	for(Object element :list)
	{
		if(element instanceof String)
		{
			String str=(String)element;
			System.out.println(str);
		}
		if(element instanceof Integer)
		{
			Integer intr=(Integer)element;
			System.out.println(intr);
		}
		
	}
	list.remove(2);
	list.add(2,"Eugin");
	System.out.println(list);
	if(list.contains("Barath"))
	{
		System.out.println("Available");
	}
	else
		System.out.println("Not Available");
	}
}

