// 1929. Concatenation of Array

/*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.*/

package leetcode_arrays;

public class ConcatOfArray {

	    public int[] getConcatenation(int[] nums) {
	        int lengthOfArray = nums.length;
	        int[] concatinatedArray = new int[lengthOfArray*2];
	        
	        for(int i=0;i<lengthOfArray;i++){
	            concatinatedArray[i] = nums[i];
	        }
	        int j=0;
	        for(int i= lengthOfArray;i<lengthOfArray*2;i++){
	            concatinatedArray[i] = nums[j];
	            j++;
	        }
	        return concatinatedArray;
	    }
	
	    public static void main(String[] args) 
	    {
	    	int[] arr = {1,2,3};
	    	ConcatOfArray obj = new ConcatOfArray();
	    	int[] newArr = obj.getConcatenation(arr);
	    	for(int i : newArr)
	    	{
	    		System.out.print(i+" ");
	    	}
	    }
}
