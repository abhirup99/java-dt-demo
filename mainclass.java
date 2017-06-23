class vehicle
{
int max_speed=210;
vehicle(int max_speed)
{
max_speed=max_speed;
}
public void showmaxspeed()
{
System.out.println("the speed is"+max_speed);
}
}
class mainclass
{
public static void main(String ang[])
{
vehicle a=new vehicle(250);
a.showmaxspeed();
}
}