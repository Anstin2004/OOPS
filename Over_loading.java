package OOPS;

class Product{
	//method 1
	public int multiply(int a, int b) {
		int prod=a*b;
		return prod;
	}
	
	//method 2
		public int multiply(int a, int b, int c) {
			int prod=a*b*c;
			return prod;
		}
}
public class Over_loading {
	public static void main(String[] args) {
		Product obj=new Product();
		System.out.println(obj.multiply(2, 3));
		System.out.println(obj.multiply(2, 3, 4));
	}

}
