package binary_search;

public class BSCountOfNumber{

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,4,4,5,6,7};
		int firstIndex = firstIndexOf(arr,4);
		int lastIndex = lastIndexOf(arr,4);

		System.out.println("Element 4 occured "+((lastIndex-firstIndex)+1)+" times in array");
	}

	public static int firstIndexOf(int[] arr,int target)
	{
		int low = 0;
		int high = arr.length-1;
		int index = -1;
		while(low<=high)
		{
			int mid = low + ((high-low)/2);
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
		int low = 0;
		int high = arr.length-1;
		int index = -1;
		while(low<=high)
		{
			int mid = low + ((high-low)/2);
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