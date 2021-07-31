package eg2;

public class Product {
	
	private int pid;
	private String name;
	private double price;
	private static float discount =2.5f;
	private static final float  ADDTION_DISCOUNT=2.3f;
	

	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.pid=101;
		p1.name="TV";
		p1.price=9999.99;
		System.out.println("printing p1");
		p1.printProduct();
		
		discount = 7.9f;
		Product p2 = new Product();
		p2.pid = 101;
		p2.name = "TV";
	    p2.price=999.99;
		System.out.println("\nPrinting p2");
		p2.printProduct();
		
		System.out.println("\nPrinting p1 again");
		p1.printProduct();
		
		
	

	}
	public void printProduct()
	{
		System.out.println("Product id : "+pid);
		System.out.println("Product name : "+name);
		System.out.println("Product price : "+price);
		System.out.println("Product discount : "+discount);
	}

}
