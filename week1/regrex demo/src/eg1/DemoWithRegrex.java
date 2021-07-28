package eg1;

public class DemoWithRegrex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidPan("fsfsfsfsfsfs"));
		System.out.println(isValidPan("FLPRI6789Q"));
		System.out.println(isValidPan("fsfsfsfsfsfs"));
		System.out.println(isValidPan("null"));


	}
   public static boolean isValidPan(String pan)
   {
	   return pan!=null && pan.matches("[A-Z] {5}[0-9]{4}[A-Z]{1}");
   }
}
