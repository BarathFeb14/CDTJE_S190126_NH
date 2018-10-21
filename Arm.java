import java.util.*;
class Arm
{
public static void main(String arg[])
{
int num,temp,n,total=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter num:");
num=s.nextInt();
n=num;
while(n!=0)
{
temp=n%10;
total=total+temp*temp*temp;
n=n/10;
}
if(total==num)
System.out.println("Armstrong Number");
else
System.out.println("Armstrong Number");
}
}