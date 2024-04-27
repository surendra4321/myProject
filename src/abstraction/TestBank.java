package abstraction;

abstract class Bank{
	
	abstract int getRateOfIntrest();
	
}
 class SBI extends Bank{

	@Override// this method comming from different class
	int getRateOfIntrest() {
		 
		return 7;
	}
	 
 }
 
 class PNB extends Bank{

	@Override
	int getRateOfIntrest() {
		 
		return 8;
	}
	 
 }

  class TestBank {

	public static void main(String[] args) {
		
		Bank b;
		b  = new SBI(); 
		
		System.out.println("Rate of Intrest of SBI is : "+b.getRateOfIntrest()+"%");
		 
		b = new PNB();
		System.out.println("Rate of Intrest of PNB is : "+b.getRateOfIntrest()+"%");
        
	}

}
