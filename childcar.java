package Pack2;
import Pack1.*;
import java.util.*;
public class childcar extends Car {

	@Override
	public void basecar() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter choice");
		engine_cc= sc.nextInt();
		 if (engine_cc==1000) {
			System.out.println("This Sedan");
		}	else if (engine_cc == 1200) {
			System.out.println("This is SUV");
		}else if (engine_cc==900) {
			System.out.println("This is Hatchback");
		}else{
			System.out.println("This is none of the car");
		}
			
			
			
			
			
			
		}	

}
