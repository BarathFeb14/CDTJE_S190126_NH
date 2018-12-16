class Fact2
{
public static void main(String arg[])
{
int i,k,fact,m=1;
for(i=1;i<=7;i++)
{
fact=1;
if(i==0||i==1)
System.out.println(m);
else
{
for(k=1;k<=i;k++)
{
fact=fact*k;
}
System.out.println(fact);
}
}
}
}

