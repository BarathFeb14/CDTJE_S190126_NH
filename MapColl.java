package List;
import java.util.*;
public class MapColl 
{
public static void main(String arg[])
{
	HashMap<Integer,String> list = new HashMap<Integer,String>();
	
	list.put(1001,"1001,Barath,Chennai,41000");
	list.put(1002,"1002,Srikanth,USA,40000");
	list.put(1003,"1003,Moin,Goa,71000");
	Set<Integer> employeeId =list.keySet();
	int i=1;
	for(Integer employeeIds :employeeId)
	{   
		String record=list.get(employeeIds);
		String recordDetails[]=record.split(",");
		System.out.println("-----Emlpoyee "+i+"-----");
		
		System.out.println("Employee ID:"+recordDetails[0]);
		System.out.println("Employee Name:"+recordDetails[1]);
		System.out.println("Employee Address:"+recordDetails[2]);
		System.out.println("Employee Salary"+recordDetails[3]);
		i++;
	}
}
}
