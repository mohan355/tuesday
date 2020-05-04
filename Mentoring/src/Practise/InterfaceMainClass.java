package Practise;

public class InterfaceMainClass implements InterfaceClass {
	

	public static void main(String[] args) {
		InterfaceMainClass obj = new InterfaceMainClass();
		obj.animalSound();
		obj.sleep();
		
		

	}

	
	public void animalSound() {
		
		System.out.println("Any Sound");
		
		
	}
	
	public void sleep() {
		
		System.out.println("Specific Sound");
		
		
		
		
	}

}
