package binary_search;

import java.util.Scanner;

public class BinarySearchFirstAndLastIndex{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,6,6,8,9};
		System.out.print("Array is : ");
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be searched : ");		
		int target = sc.nextInt();
		
		int firstIndex = firstIndexOf(arr,target);
		int lastIndex = lastIndexOf(arr,target);

		int[] result  = {firstIndex,lastIndex};

		System.out.print("first and last index of element "+target+" : ");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
	}

	public static int firstIndexOf(int[] arr,int target)
	{
		int index =-1;
		int low =0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = low +((high-low)/2);

			if(arr[mid]==target)
			{
				index = mid;
				high = mid-1;
			}
			else if(arr[mid]>target)
			{
				high = mid-1;
			}
			else low = mid+1;
		}
		return index;
	}
		
	public static int lastIndexOf(int[] arr,int target)
	{
		int index =-1;
		int low =0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = low +((high-low)/2);

			if(arr[mid]==target)
			{
				index = mid;
				low = mid+1;
			}
			else if(arr[mid]>target)
			{
				high = mid-1;
			}
			else low = mid+1;
		}
		return index;
	}	
}