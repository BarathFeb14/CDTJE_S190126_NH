import java.util.*;
class Pal
{
public static void main(String arg[])
{
int n,rem,total=0,temp;
Scanner s = new Scanner(System.in);
System.out.println ("Enter n:"); 
n= s.nextInt();
temp=n;
while(n!=0)
{
rem=n%10;
total=total*10+rem;
n=n/10;
}
 if (temp == total)
            System.out.println(temp+ " is a palindrome.");
        else
            System.out.println(temp+ " is not a palindrome.");
}
}

