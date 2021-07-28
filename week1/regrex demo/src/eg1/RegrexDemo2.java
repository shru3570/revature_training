package eg1;

public class RegrexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Mob="+91-9860279768";
		if(Mob.matches("\\+91-[0-9]{10}")) { 
			System.out.println("valid");
		}
		else 
		{
			System.out.println("Not Valid");
		}

	}

}
