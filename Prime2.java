import java.util.*;
class Prime2
{
public static void main(String arg[])
{
int k,s1,s2,count=0,i;
 Scanner s = new Scanner(System.in);
         System.out.println ("Enter the lower limit :"); 
         s1 = s.nextInt();
         System.out.println ("Enter the upper limit :"); 
         s2 = s.nextInt();
for(k=s1;k<=s2;k++)
{
for(i=2;i<k;i++)
{
if(k%i==0)
{
count=0;
break;
}
else
{
count=1;
}
}
if(count==1)
System.out.println(k);
}
}
}


