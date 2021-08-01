package Day4;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,2,3,4,5,5};
        removeDuplicate(arr);
        
        
	}
	public static void removeDuplicate(int arr[])
	{
		System.out.println("Array with duplicate"+Arrays.toString(arr));
        int temp[]=new int[arr.length];
        int j=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
        	if(arr[i]!=arr[i+1])
        	{
        		temp[j]=arr[i];
        		j++;
        	}
			
		}
        temp[j]=arr[arr.length-1];
        System.out.println("Array without duplicates(with extra zero):"+Arrays.toString(temp));
        
        System.out.println("Array without duplicates (without extra zeros)");
        for(int i=0;i<j;i++)
        {
        	System.out.print(temp[i]+" ");
        }
	}

}
