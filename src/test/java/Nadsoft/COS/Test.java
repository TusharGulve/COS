package Nadsoft.COS;

public class Test {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		System.out.println("Values of a = " +a);
		System.out.println("Values of b = " +b);
		
		b = b-a; //(1)
		a = a+b; //(3)
		b = a-b; //(2)
		
		System.out.println("Values of a = " +a);
		System.out.println("Values of b = " +b);
				
		
				

	}

}
