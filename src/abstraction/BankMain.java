package abstraction;

public class BankMain {

	public static void main(String[] args) {
		 Bank1 bb;
		 bb = new SBI1();
		   int res= bb.RateofInterest();
		   System.out.println("The rate od intrest of Sbi is :"+res);
         bb = new PNB1();
         int res1= bb.RateofInterest();
		   System.out.println("The rate od intrest of pnb1 is :"+res1);
		   
		   bb = new Union();
	         int res2= bb.RateofInterest();
			   System.out.println("The rate od intrest of Union is :"+res2);
	}

}
