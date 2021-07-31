package eg1;

public class Demo1 {
	
	public Demo1()
	{
		System.out.println("I am constructor I will executed for every object Creation ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello this is from main");
		Demo1 d=new Demo1();
		iAmStatic();
		d.iAmNonStatic();
	//	iAmStatic();
		Calci c=new Calci();
		Calci.iAmStatic();
		c.iAmNonStatic();
		
		

	}
	
	public static void iAmStatic()
	{
		System.out.println("Hello this is the Static Method");
		
	}
	public void iAmNonStatic()
	{
		System.out.println("Hello i am non static");
	}
	static{
		System.out.println("I am anonymous static block i will be executed only once even before the main");
	}
	{
		System.out.println("I am anonymous block I will be executed everytime you create a object,even before the constructor");
	}

}
