package Practise;

public class PolymorphismClass {
	

	public static void main(String[] args) {
		 Animal Anml=new  Animal();
		 pig pg=new pig();
		 Dog Dg=new Dog();
		 
		 Anml.animalsound();
		 pg.animalsound();
		 Dg.animalsound();

	}

}
  class Animal{
	 public void animalsound() {
		 System.out.println("Animal");
	 }
	 
	 
 }
   class pig extends Animal {
	   
	   public void animalsound() {
		   
		   System.out.println("pig");
	   }
	   
	   
   }
   class Dog extends Animal {
	   
	   public void animalsound() {
		   
		   System.out.println("Dog");
	   }
	   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   