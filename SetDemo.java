package List;
import java.util.*;
public class SetDemo
{
public static void main(String arg[])
{   HashSet hashset= new HashSet();
	hashset.add("Barath");
	hashset.add("Srikanth");
	hashset.add("Moin");
	System.out.println("HashSet element:"+hashset);
	
LinkedHashSet lhashset= new LinkedHashSet();
		lhashset.add("Barath");
		lhashset.add("Srikanth");
		lhashset.add("Moin");
		System.out.println("Linked Hash Set element:"+lhashset);
		
TreeSet treeset= new TreeSet();
treeset.add("Barath");
treeset.add("Srikanth");
treeset.add("Moin");
			System.out.println("Tree Set element:"+treeset);
}
}
