package Day4;

import java.util.Arrays;

public class Find_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {121,100,343,22};
		findPalindrome(arr);
		
	}
		
	public static void findPalindrome(int arr[]) {
		
		System.out.println("Arrays :"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			int rev=0;
			while(x!=0)
			{
				int digit=x%10;
				rev=rev*10+digit;
				x=x/10;
			}
			if(rev==arr[i])
			{
				System.out.println(arr[i]+" is palindrome");
			}
			else
			{
				System.out.println(arr[i]+" Not palindrome");
			}
			
		}
		
	}

}
