import java.util.*;
class PrimeNo
{
public static void main (String []ang)
{
int i,m=0,flag=0;
int n;
Scanner Sc=new Scanner(System.in);
n=Sc.nextInt();
m=n/2;
for(i=2;i<=m;i++)
{
if (n%i==0)
{
System.out.println("NUMBER IS NOT PRIME");
flag=1;
break;
}
}
if(flag==0)
System.out.println("THE NO IS PRIME");
}
}
