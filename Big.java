import java.util.*;
class Big
{
public static void main(String arg[])
{
int a,b,c;
Scanner s = new Scanner(System.in);
System.out.println("Enter A :");
a=s.nextInt();
System.out.println("Enter B :");
b=s.nextInt();
System.out.println("Enter C :");
c=s.nextInt();
if(a>b)
{
if(a>c)
System.out.println("The Biggest number is "+a);
else
System.out.println("The Biggest number is "+c);
}
else
{
if(b>c)
System.out.println("The Biggest number is "+b);
else
System.out.println("The Biggest number is "+c);
}

if(a<b)
{
if(a<c)
System.out.println("The Smallest number is "+a);
else
System.out.println("The Smallest number is "+c);
}
else
{
if(b<c)
System.out.println("The Smallest number is "+b);
else
System.out.println("The Smallest number is "+c);
}
}
}

