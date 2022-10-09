package recursion;

import java.util.Scanner;
public class LastIndexInArray{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the all elements");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the element to find last index");
		int data = sc.nextInt();
		System.out.println(lastIndexOf(arr,data,0));

	}
	public static int lastIndexOf(int[] arr,int data,int index){
		
		if(index==arr.length) return -1;

		int lastIndex = lastIndexOf(arr,data,index+1);

		if(lastIndex==-1){
			if(arr[index]==data){
				lastIndex = index;
			}
		}
		return lastIndex;
	}
}