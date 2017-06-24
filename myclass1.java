package mypack;
import java.util.*;
		class myclass1 extends  myclass
		{
			int shippingprice=10;
			public void printinfo()
			{
				displayInfo();
				System.out.println("THE TOTAL SHIPPING PRICE ARE:"+shippingprice);
			}
			public static void main(String []ang)
			{
				myclass pb=new myclass();
				pb.displayInfo();
			}

	}


