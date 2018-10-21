import java.util.*;
class Table2
{
public static void main(String arg[])
{
int n,i,mul=0;
for(n=1;n<=10;n++)
{
System.out.println("Multiplication Table of "+n); 
for(i=1;i<=10;i++)
{
mul=i*n;
System.out.println(n+" x "+i+" = "+mul);
}
}
}
}