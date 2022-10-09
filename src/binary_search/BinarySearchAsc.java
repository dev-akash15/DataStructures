package binary_search;

import java.util.Scanner;

public class BinarySearchAsc{

	public static void main(String[] arr){
		
		Scanner sc = new Scanner(System.in);	
	
		int[] array = {1,2,4,5,7,9,10};

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("Enter the element from above to search");
		System.out.println();
		
		int element = sc.nextInt();
		
		int index = binarySearch(array,element);
		if(index==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index : "+index);
		}

	}

	public static int binarySearch(int[] arr,int element)
	{
		int low = 0;
		int high = arr.length;
		
		while(low<=high)
		{
			int mid = low +((high-low)/2);
			if(arr[mid]==element)
			{
				return mid;
			}
			else if(arr[mid]<element)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		return -1;
	}

}