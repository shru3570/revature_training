package Day4;

public class FirstLastDigitSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {100,101,103,343,787,22,18};
         isFirstLastDigitSame(arr);
	}
	public static void isFirstLastDigitSame(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			int x=arr[i];
			int lastDigit=0;
			lastDigit=x%10;
			while(!(x>0 && x<=9))
			{
				x=x/10;
			}
			if(x==lastDigit) {
				System.out.println(arr[i]+":First and last Digit is same ");
			}
			
		}
		
	}
}
