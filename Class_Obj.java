package OOPS;
public class Class_Obj {
	//Instance Variable
	String name="Malar";
	int id=5;
	double salary=98765765;
	int bonus=9000;
	 
	public static void main(String[] args) {
		//if Class is a  car 
		//Then, obj --> audi,bmw,merc,tata, kia
		//Classname obj = new Classname();
		//new is used to create obj explicitly\
		
		Class_Obj obj=new Class_Obj();
		Class_Obj obj1=new Class_Obj();
		
		obj.id=8;
		
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		System.out.println(obj1.bonus);
		
	}
}
