class Grandpa { 
	public void show() 
	{ 
		System.out.println("Grandpa class"); 
	} 
} 

class Dad extends Grandpa { 
	
	@Override public void show() 
	{ 
		System.out.println("Dad class"); 
	} 
} 
class Me extends Dad { 
	
	@Override public void show() 
	{ 
		System.out.println("Me class"); 
	} 
} 

public class Family { 
	public static void main(String[] args) 
	{ 
		Grandpa grandpa = new Grandpa(); 
		
		
		Grandpa dad = new Dad(); 
		
		
		Grandpa me = new Me(); 
		
		 
		grandpa.show(); 
		
		dad.show(); 
		
		me.show(); 
	} 
}