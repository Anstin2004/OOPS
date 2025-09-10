package Task;
import java.util.*;
class Overloading{
	
	String name;
	int Rollno, Subject1, Subject2, Subject3, Subject;
	
	//Constructor
	Overloading(String OurName, int OurRollno){
		this.name=OurName;
		this.Rollno=OurRollno;
	}
	//method 1
	public int calculateMarks(int Subject1, int Subject2) {
		this.Subject1=Subject1;
		this.Subject2=Subject2;
		int Total_sub = Subject1 + Subject2;
		return Total_sub;
	}
	
	//Method2
	public int calculateMarks(int Subject1, int Subject2, int Subject3) {
		this.Subject1=Subject1;
		this.Subject2=Subject2;
		this.Subject3=Subject3;
		int Total_sub = Subject1 + Subject2 + Subject3;
		return Total_sub;
	}
	
	//Method3
	public int calculateMarks(int Subject) {
		this.Subject=Subject;
		return Subject;
	}
	
	//student Details
	public void StdDetails() {
		System.out.print("The Student name is '"+name+"' and their Roll No is '"+Rollno);
	}
}
public class Method_OverLoading {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name --> ");
		String a=sc.nextLine();
		System.out.print("Enter Rollno --> ");
		int r=sc.nextInt();
		Overloading od=new Overloading(a,r);
		
		od.StdDetails();
		od.calculateMarks(56, 89);
		od.calculateMarks(97, 39, 98);
		od.calculateMarks(3);
		System.out.print("' .In addition to that, the total mark in method1 is '"
						+od.calculateMarks(56, 89)+"' and for method2 is '"+od.calculateMarks(97, 39, 98)+"'");
		
		sc.close();
	}

}
