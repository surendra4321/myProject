package impQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDemo1 {

	public static void main(String[] args) {
		 ArrayList<String> str  = new ArrayList<String>();
		 str.add("Vinay");
		 str.add("Sachin");
		 str.add("Ashutosh");
		 System.out.println(str);
		 str.clone();
		 System.out.println(str);
		 System.out.println(str);
		 
		 List<String> str1 = new ArrayList<String>();
		 str1.add("Laptop");
		 str1.add("Charger");
		 str1.addAll(str);
		 System.out.println(str1);
		 
		 String []arr = new String[str1.size()];
		 for(String aa : arr) {
			 System.out.print(aa);
			 
		 }
		 List<String>i = str1.subList(0, 4);
		 System.out.println(i);
		 Collections.reverse(str1);
		 for (String string : str1) {
			System.out.print(string+" ");
		}
		 System.out.println("###########################################");
		 System.out.print(str1+" ");
		 Collections.shuffle(str1);
		 
		 for (String string1 : str1) {
			 System.out.print(string1+" ");
			
		}
	}

}
