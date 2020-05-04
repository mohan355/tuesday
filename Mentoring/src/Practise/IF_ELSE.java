package Practise;

public class IF_ELSE {

	public static void main(String[] args) {
		
		int a= 85;
		
		if(a>=90 && a <=100) {
			System.out.println("The Grade is A: " +a);
			}
		else if(a>=80 && a<90){
			System.out.println("The Grade is B: " +a);
		}
		else if(a>=70 && a <80) {
			System.out.println("The Grade is C:"  +a);
			
		}
		else {
			System.out.println("Try Agbain:" +a);
		}

	}

}
