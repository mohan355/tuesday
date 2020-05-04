package Practise;

public class CreateObject {
	
 	
        int x=4;
		int y=8;
		int z=x+y;
 	
 	public void addition() {
 		
 		System.out.println(z);
 		
 	}

	public static void main(String[] args) {
		
		CreateObject obj=new CreateObject();
		obj.addition();
		
		obj.x=20;
		System.out.println(obj.x);

	}

}
