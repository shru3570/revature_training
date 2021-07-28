package eg1;

public class DemoWithoutRegEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(isValidPan("fsfsfsfsfsfs"));
		System.out.println(isValidPan("FLPRI6789Q"));
		System.out.println(isValidPan("fsfsfsfsfsfs"));
		System.out.println(isValidPan("null"));

	}
	public static boolean isValidPan(String pan)
	{
		boolean b=false;
		
		if(pan.length()== 10 && Character.isUpperCase(pan.charAt(9)))
		{
			int upper=0;
			for(int i=0;i<=5;i++)
			{
				if(Character.isUpperCase(pan.charAt(i))) {
					upper++;
					
				}
			}
			if(upper == 5)
			{
				int digits=0;
				for(int i=5;i<9;i++)
				{
					if(Character.isDigit(pan.charAt(i)))
					{
						digits++;
					}
				}
				if(digits==4)
				{
					b=true;
				}
				
				
			}
		}
		return b;
		
	}

}

