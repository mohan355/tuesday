package Practise;

public class EncapusulationClass {
	
	  private int x=15;
	
	  private String name="mohan";
	

	public static void main(String[] args) {
		
		EncapusulationClass obj=new EncapusulationClass();
		
		System.out.println(obj.getX());
		obj.setX(20);
		System.out.println(obj.getX());
		
		System.out.println(obj.getName());
		obj.setName("Kafle");
		System.out.println(obj.getName());
		
		
		}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
