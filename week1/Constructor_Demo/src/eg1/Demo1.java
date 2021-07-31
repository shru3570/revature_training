package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		Calculator c=new Calculator("Shruti");
		System.out.println("add="+c.add());
		
		c=new Calculator(10,22);
		
		System.out.println("add="+c.add());
		System.out.println("add="+c.sub());
		System.out.println("add="+c.multiply());
		
		
		
		
		

	}

}
