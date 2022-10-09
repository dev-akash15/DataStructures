package recursion;

import java.util.Scanner;
public class FirstIndexInArray{

	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to find first index");
		int element = sc.nextInt();
		int index = firstIndexOf(arr,element,0);
		System.out.println("First index of "+element+" is :"+index);
	}

	public static int firstIndexOf(int[] arr,int element,int index)
	{
		if(index==arr.length) return -1;
		if(arr[index]==element){
			return index;
		}
		else
		{
		return firstIndexOf(arr,element,index+1);
		}
	}
}