package accessModifiers;
// --Private access modifiers-->>Access inside the class but we can not access outside class
class B{
	
	private int a =20;
  private void info() {
		System.out.println("Hey i am a private method");
	}
}






public class A {
      public static void main(String[] args) {
    	  
	  B	b = new B();
	  b.a// Compile time error
	  b.info();// Compile time error
	}
}
