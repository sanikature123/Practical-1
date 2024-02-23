class Fyit { 
	public void show() 
	{ 
		System.out.println("fybscit class"); 
	} 
} 

class Syit extends Fyit { 
	
	 public void show() 
	{ 
		System.out.println("sybscit class"); 
	} 
} 
class Tyit extends Syit { 
	
	public void show() 
	{ 
		System.out.println("tybscit class"); 
	} 
} 

public class Siws { 
	public static void main(String[] args) 
	{ 
		Fyit fyit = new Fyit(); 
		Fyit syit = new Syit(); 
		Fyit tyit = new Tyit();  
		fyit.show(); 
		syit.show(); 
		tyit.show(); 
	} 
}