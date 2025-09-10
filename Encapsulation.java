package OOPS;

public class Encapsulation {
	private String name;
	public String getName() // getter
	{
		return name;
	}
	
	public void setName(String newName) {
		this.name=newName;
	}
	public static void main(String[] args) {
		
		Encapsulation obj=new Encapsulation();
		obj.setName("Anstin");
		System.out.println(obj.getName());
	}
}
