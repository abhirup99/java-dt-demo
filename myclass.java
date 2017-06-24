package mypack;
public class myclass
{
	int page_num;
	String authorname,name;
	float price;
	public  myclass()
	{
		page_num=500;
		authorname="Abhirup Sarkar";
		name="The Living Ideas";
		price=100.90f;
	}
	public void displayInfo()
	{
		System.out.println("THE NAME OF BOOK IS:"+name );
		System.out.println("THE PRICE OF BOOK IS:"+price );
		System.out.println("THE AUTHER OF BOOK IS:"+authorname );
		System.out.println("THE TOTAL NUMBER OF PAGE IS:"+page_num );
	}
	
		
		

	
		

}
