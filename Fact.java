import java.util.*;
class Fact
{
public static void main(String arg[])
{
int n,k,fact=1;
Scanner s = new Scanner(System.in);
System.out.println("Enter n: ");
n=s.nextInt();
if(n==0||n==1)
System.out.println("Factorial of "+n+" is 1");
else
{
for(k=1;k<=n;k++)
{
fact=fact*k;
}
System.out.println("Factorial of "+n+" is "+fact);
}
}
}

