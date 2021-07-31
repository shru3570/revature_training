package eg1;

public class DemoOnStrBufferBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("hello");
		System.out.println("contents of sb1 : "+sb1+" memory of sb1 : "+System.identityHashCode(sb1));
		sb1.append(" hey ").append(123).append(12.333).append(true);
		System.out.println("contents of sb1 : "+sb1+" memory of sb1 : "+System.identityHashCode(sb1));
		
		sb1.delete(0, 2);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		sb1.insert(1, " I am inserted ");
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("hello");
		StringBuffer sb3=new StringBuffer("hello");
		
		if(sb2.toString().equals(sb3.toString())) {
			System.out.println(" both are equal ");
		}
		else
		{
			System.out.println(" both are equal ");
			
		}
		System.out.println("hello".equals("hello"));
		
		

	}
}
 