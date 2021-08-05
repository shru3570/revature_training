package task1;

import java.util.Scanner;



public class PresenterLayer {
	public static void main(String [] args)
	{
		
	
	Scanner sc=new Scanner(System.in);
	BusinessLayer b1=new BusinessLayer();
	 System.out.print("Emter the  Adhar number to validate ");
    
	
	try {
		b1.isValidAadharCard(sc.nextLine());
	}catch(InvalidAdharException e) {
    	System.out.println(e.getMessage());
	}finally{
		System.out.println("Error handling is succesful");
	}

	System.out.println();
	
	BusinessLayer b2=new BusinessLayer();
	System.out.print("Enter the password to validate");
	try {
		b2.isValidPassword(sc.nextLine());
	}catch(InvalidPasswordException e1){
		System.out.println(e1.getMessage());
	}finally {
		System.out.println("Error Handling is Succesful");
	}
	sc.close();
	}	

}
