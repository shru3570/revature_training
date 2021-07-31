package eg1;

public class Title_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello you have to concentrate here";
		System.out.println(convertTotheTitledCase(s));

	}
	public static String convertTotheTitledCase(String s) {
		String arr[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
			
		}
		
		
		return sb.toString().trim();
		
		
		
		
	}

}
