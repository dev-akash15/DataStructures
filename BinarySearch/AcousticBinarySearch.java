import java.util.Scanner;

public class AcousticBinarySearch{

	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of an array");
	 int n = sc.nextInt();
	 int[] arr = new int[n];
	 System.out.println("Enter the "+n+" elements in asc or dsc order");
	
	 for(int i=0;i<n;i++)
	 {
	 	 arr[i] = sc.nextInt();
	 }

	 for(int j: arr)
	 {
		System.out.print(j+" ");
	 }

	 System.out.println("Enter the element to be searched from above array :");
	 System.out.println();
	 
	 int target = sc.nextInt();
	 int index = -1;
	 if(arr[0]>arr[arr.length-1])
    	 {
		index = binarySearchDsc(arr,target);
	 }
	 else index = binarySearchAsc(arr,target);

	 if(index==-1) System.out.println("Element not found");
	 else System.out.println("Element is found at : "+index);
	}

	public static int binarySearchAsc(int[] arr,int target)
	{
	 	int low = 0;
		int high = arr.length-1;
		while(low<=high)
		{
			int mid = low + ((high-low)/2);
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]>target) high = mid-1;
			else low = mid+1;
		}
		return -1;
	}

	public static int binarySearchDsc(int[] arr,int target)
	{
	 	int low = 0;
		int high = arr.length-1;
		while(low<=high)
		{
			int mid = low + ((high-low)/2);
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]>target) low = mid+1;
			else high = mid-1;
		}
		return -1;
	}
}