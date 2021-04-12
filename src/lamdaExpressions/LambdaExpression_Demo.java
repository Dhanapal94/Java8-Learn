package lamdaExpressions;

@FunctionalInterface
interface Cab{
	public void bookCab();
}

@FunctionalInterface
interface CabOla{
	public void bookCab(String source,String destination);
}

@FunctionalInterface
interface CabUber{
	public int bookCab(String source,String destination);
}

public class LambdaExpression_Demo {

	public static void main(String[] args) {
	
		Cab c =()->System.out.println("Booking Cab!");
		c.bookCab();
		
		CabOla co =(s,d)->{
             System.out.println("Booking ola Cab!");
             System.out.println("Source is :"+s+" Destination is:"+d);
		};
		
		co.bookCab("Coimbatore","Bangalore");
		
		CabUber cu =(s,d)->{
            System.out.println("Booking Uber Cab!");
            System.out.println("Source is :"+s+" Destination is:"+d);
            if(s.equals("Coimbatore")&&d.equals("Bangalore")) {
            	return 1000;
            }
            else {
            	return 500;
            }
		};
		
		System.out.println(cu.bookCab("Bangalore","Coimbatore"));
	
		
		
		
		
	}	

}
