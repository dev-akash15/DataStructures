package recursion;

public class IsArraySorted{

	public static void main(String[] s){
		
		int[] array = {1,7,3,4,5,6,7,8};

		if(isSorted(array,0)) System.out.println("Array is sorted");
		else System.out.println("Not sorted");
	}

	public static boolean isSorted(int[] arr,int index){
		
		if(index==arr.length-1) return true;

		if(arr[index]>arr[index+1]) return false;
		else return isSorted(arr,index+1);
	}
}