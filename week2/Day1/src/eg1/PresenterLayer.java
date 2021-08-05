package eg1;

import java.nio.file.InvalidPathException;

public class PresenterLayer {

	public static void main(String[] args) throws InvalidPanNumber {
		// TODO Auto-generated method stub
         BusinessLayer bl = new BusinessLayer();
		
		try {
			bl.isValidAge(36);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error Handling Sucessful!!");
		}
		
		System.out.println();
		
		try {
			bl.isValidPan("BCED124D");
		} catch (InvalidPanNumber e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error Handling Sucessful!!");
		}
		
	}


	}


