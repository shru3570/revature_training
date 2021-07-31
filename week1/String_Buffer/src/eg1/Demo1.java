package eg1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindromeDetailedWay("wow"));
		int x=100;
		System.out.println(isPalindromeDetailedWay(x+""));
		System.out.println(isPalindromeDetailedWay("madam"));
		
		//==========================================
		System.out.println(isPalindromeShortHand("madam"));
		System.out.println(isPalindromeShortHand("shruti"));
		x=101;
		System.out.println(isPalindromeShortHand(x+""));
		
		
		

	}
	public static boolean isPalindromeDetailedWay(String s) {
		 StringBuilder sb= new StringBuilder(s);
		 sb.reverse();
		 String s1=sb.toString();
		 
		return s.equals(s1) ;
		 
		 }
	public static boolean isPalindromeShortHand(String s)
	{
		return new StringBuilder(s).reverse().toString().equals(s);
	}
	

}
