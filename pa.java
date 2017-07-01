class pa<X,Y>
{
private X first;
private Y second;

public pa(X a1,Y a2)
{
first=a1;
second=a2;
}
public X getFirst()
{
return first;
}
public Y getSecond()
{
return second;
}
public static void main (String[] ang)
{
pa<String,Integer>ob1=new pa<String,Integer>("Test",1);
System.out.println("String is "+ob1.getFirst());
System.out.println("Integer is "+ob1.getSecond());

pa<Integer,String>ob2=new pa<Integer,String>(2,"Demo");
System.out.println("Integer is "+ob2.getFirst());
System.out.println("String is "+ob2.getSecond());
}
}