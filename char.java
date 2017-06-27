import java.util.*;
class Char
{
public static void main(String[]arg)
{
int i=0;
Scanner Sc=new Scanner(System.in);
System.out.println("ENTER THE CHARACTER:");
char ch=Sc.next().charAt(0);
switch(ch)
{
case'a':
case'e':
case'i':
case'o':
case'u':
case'A':
case'E':
case'I':
case'O':
case'U':
i++;
}
if(i==1)
System.out.println("Enter Character"+ch+"is Vowel");
else
if((ch>='a'&&ch<='z')||(ch<='A'&&ch<='Z'))
System.out.println("ENTER CHARACTER"+ch+"is CONSONENT");
else
System.out.println("NOT AN ALPHABET");
}
}
