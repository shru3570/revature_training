package task1;

public class BusinessLayer {
	public void isValidAadharCard(String adharcard) throws InvalidAdharException
	{
		adharcard=adharcard.replaceAll(" ", "").trim();
		if(adharcard.matches("[0-9]{12}"))
		{
			System.out.println("Adhar card Number is valid");
		}
		else {
			throw new InvalidAdharException("You entered invalid aadhar card number");
		}
		
	}
	public void isValidPassword(String password) throws InvalidPasswordException
	{
		if(password.matches("[A-Z]{1}[0-9]{1}[@#%$!]{1}[a-zA-z]{6}"))
		{
			System.out.println("Your password is Valid :"+password);
		}
		else
		{
			throw new InvalidPasswordException("You entered wrong password :"+password);
		}
	}

	

	

}
