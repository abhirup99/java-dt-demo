package mypack;

class an1
{
void eat()
{
	System.out.println("Animal.....eat");
}
}
class cat extends an1
{
	void eat()
	{
		System.out.println("CAT....EATING");
		
	}

void work()
{
	super.eat();
}
}
public class animal
{
	public static void main(String[]ar)
	{
	an1 a=new an1();
	a.eat();
	cat c=new cat();
	c.eat();
	c.work();
}}

