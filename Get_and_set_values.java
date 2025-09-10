package Task;

class Student{
	private String name;
	private int rollno;
	private int marks;
	

	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name=newName;
	}
	
	
	public int getRollno(){
		return rollno;
	}
	
	public void setRollno(int newRoll) {
		this.rollno=newRoll;
	}
	
	
	public int getMark() {
		return marks;
	}
	public void setMark(int newMark) {
		this.marks=newMark;
	}
	
}
public class Get_and_set_values {

	public static void main(String[] args) {
		Student st=new Student();
		st.setName("Bruse Lee");
		st.setRollno(21);
		st.setMark(98);
		
		System.out.println(st.getName());
		System.out.println(st.getRollno());
		System.out.println(st.getMark());
		
	}

}
