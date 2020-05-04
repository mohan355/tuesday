package Practise;

public class AbstactMainClass {

	public static void main(String[] args) {
		
		AbstractSubClass obj=new AbstractSubClass();
		
		System.out.println(obj.Fname);
		System.out.println(obj.Lname);
		obj.Study();
		System.out.println(obj.year);
		
		
		

		
	}

}
