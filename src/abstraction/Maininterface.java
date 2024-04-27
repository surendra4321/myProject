package abstraction;
class Print1 implements Printable{

	@Override
	public void print() {
		 System.out.println("Hello interface");
		
	}
	
}

//-->>Why we use interface??
//-->>Use to achieve 100% abstraction
//-->>Use to achieve loose coupling
public class Maininterface {

	public static void main(String[] args) {
	 Print1 pp =new Print1();
	 System.out.println(Printable.a);
	 pp.print();
	 

	}

}
