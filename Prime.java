import java.util.*;
class Prime
{
public static void main(String arg[])
{
int n,m=0,i,f=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter n: ");
n=s.nextInt();
m=n/2;
if(n==0||n==1)
System.out.println(n+" is not a Prime number");
else
{
for(i=2;i<=m;i++)
{
 if(n%i==0)
{
System.out.println(n+" is not a Prime number");
f=1;
break;
}
}
if(f==0)
{
System.out.println(n+" is a Prime number");
}
}
}
}

