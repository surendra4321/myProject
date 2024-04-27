package protected1;
//-->>Protected : Accessible within the package and outside
//the package but through inheritance only
import accessModifiers.P;  
class MainProtected extends P{

	public static void main(String[] args) {
		MainProtected mp =  new MainProtected(); 
	  mp.name1();
	}

}
