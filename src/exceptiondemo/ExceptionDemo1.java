package exceptiondemo;
//Exception: Exception is an abnormal condition
//1.Checked, 2.Unchecked, 3.Error: //
//Exception Handeling :  try, catch, finally, throw and throws 
public class ExceptionDemo1 {

	public static void main(String[] args) {
		 try {
		int a =100/0;
		 }catch(Exception a){
			System.out.println(a);
			 
		 }
		System.out.println("Rest Code");
     
	}

}
