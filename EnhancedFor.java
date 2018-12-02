package List;

import java.util.*;

public class EnhancedFor 
{
public static void main(String arg[])
{
	ArrayList list=new ArrayList();
	list.add("Blaze");
	list.add("Srikanth");
	list.add("Moin");
	list.add(100);
	list.add(200);
	for(Object element:list)
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
}
}
