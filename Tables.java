import java.util.*;
class Tables
{
public static void main(String arg[])
{
int n,i,mul=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter n: ");
n=s.nextInt();
for(i=1;i<=10;i++)
{
mul=i*n;
System.out.println(n+" x "+i+" = "+mul);
}
}
}