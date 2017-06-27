import java.util.*;
public class Factorial
{
public static void main(String []arg){
int n;
Scanner Sc=new Scanner(System.in);
n=Sc.nextInt();
int result=factorial(n);
System.out.println("THE FACTORIAL NUMBER IS :"+result);
}
public static int factorial(int n)
{
if(n==0)
{
return 1;
}
else
{
return n*factorial(n-1);
}
}
}
