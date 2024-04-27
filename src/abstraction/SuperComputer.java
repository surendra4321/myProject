package abstraction;
//Child Computer
public class SuperComputer extends Computer{
	
	@Override//-->>This method is present in different class
	void speed(String name) {
		System.out.println("SuperComputer is Created"+name);
	}
	

}
