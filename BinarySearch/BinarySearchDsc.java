import java.util.Scanner;

public class BinarySearchDsc{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] arr = {9,7,5,4,3,2,1};
		
		for(int j: arr)
		{
			System.out.print(j+" ");
		}
		
		System.out.println();
		System.out.println("Enter the element to be searched");
		System.out.println();
		
		int element = sc.nextInt();

		int index = binarySearchDsc(arr,element);
		if(index==-1)
		{
			System.out.println("Element not found");
		}
		else System.out.println("Element found at index : "+index);
	}
	
	public static int binarySearchDsc(int[] arr,int element)
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = low + ((high-low)/2);
			if(arr[mid]==element){
				return mid;
			}
			else if(arr[mid]>element)
			{
				low = mid+1;
			}
			else high = mid-1;
		}
		return -1;
	}
}