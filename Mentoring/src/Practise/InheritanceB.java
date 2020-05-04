package Practise;

public class InheritanceB extends InheritanceA  {
	
	private String modelName = "Mustang";

	public static void main(String[] args) {
		
	//	InheritanceA obj=new InheritanceA();
		
		InheritanceB obj1=new InheritanceB();
		
		
		
         obj1.honk();
		 System.out.println(obj1.modelName);
		 System.out.println(obj1.brand);
		
		
	
	}

}

