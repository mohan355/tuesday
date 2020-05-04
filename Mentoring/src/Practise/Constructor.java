package Practise;

public class Constructor {
	
	int a;
	
	public  Constructor(int b) {
		
		a=b;
		
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor(5);
		System.out.println(obj.a);

	}

}
