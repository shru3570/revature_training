package eg1;

import java.nio.file.InvalidPathException;

public class BusinessLayer {
	public void isValidAge(int age) throws InvalidAgeException
	{
		 if(age<18 || age>35)
	      {
	    	  throw new InvalidAgeException("You are not eligible");
	      }
	      System.out.println("You're age is "+age+" and you are eligible");
	      
	}
	public void isValidPan(String panNumber)throws  InvalidPanNumber{
		if(!panNumber.matches("[A-Z]{4}[0-9]{3}[A-Z]{1}"))
		{
			throw new InvalidPanNumber("Pan card is invalid");
		}
		else {
			System.out.println("Pan card is valid");
		}
	}
}


