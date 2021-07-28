package Address;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				String s=sc.nextLine();
		if(s.startsWith("https"))
			System.out.println("Secured");
		else
			System.out.println("Not Secured");
			
		

	}

}
