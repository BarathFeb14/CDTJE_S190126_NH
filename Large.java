import java.util.*;
class Large
{
public static void main(String arg[])
{
int n,num,i,big=0,small=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter n: ");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.println("Enter num "+i);
num=s.nextInt();
if(num>big)
big=num;
}
System.out.println("The biggest number is "+big);
}
}