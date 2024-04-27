package exceptionDemo1;

import java.io.IOException;
import java.util.Scanner;

//try, catch, finally, throw and throws
public class ExceptionMain   {
//throw: throw is besically use to throw the exception
	//-->>Custom exception
	//throws: is basically indicate to caller this method can throws this exception
	
	public static void print(String name) throws Exception {
		 if(name.equals("Alain")) {
	         	//throw new RuntimeException("Hey Alain, I hate you");
	         	 
	         }
		 System.out.println("Hello Mr."+name);   
	}
	
	
	public static void main(String[] args){
	     Scanner sc =new Scanner(System.in);
         String name = sc.nextLine();
         
         try {
        	 print(name);
         }catch (Exception e) {  
		     
         System.out.println(e);
         
         }
        
        
       
	}

}
