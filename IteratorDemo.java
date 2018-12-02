package List;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
	public static void main(String arg[])
	{
		ArrayList list=new ArrayList();
		list.add("Blaze");
		list.add("Srikanth");
		list.add("Moin");
		list.add(100);
		list.add(200);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{   Object element=itr.next();
			if(element instanceof String)
			{
				String str=(String)element;
				System.out.println(str);
				if(str.equals("Moin"))
				itr.remove();
			}
			if(element instanceof Integer)
			{
				Integer intr=(Integer)element;
				System.out.println(intr);
			}
		}
		System.out.println("After Iteration"+list);
	}
	}

