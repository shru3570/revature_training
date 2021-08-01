package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class NthMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Number of Elements :");
          int n =sc.nextInt();
          
          int arr[]= new int[n];
          System.out.println("Enter"+arr.length+"elements :");
          for (int i = 0; i < arr.length; i++) {
        	  arr[i]=sc.nextInt();
			
		}
          System.out.println("Array :"+Arrays.toString(arr));
          System.out.println("Enter nth element to find Nth Max element");
          int k=sc.nextInt();
          int count=0;
          int max=0;
          sc.close();
          
          Arrays.sort(arr);
           for (int i = 0; i < k; i++) {
        	   if(arr[i]<arr[i+1]) {
        		   max=arr[i+1];
        		   //count++;
        	   }
        	   
			
		}
           System.out.println(k+"th Max Element is"+max);
	}

}
