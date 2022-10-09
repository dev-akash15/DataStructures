
// 164. Maximum Gap


/*Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

You must write an algorithm that runs in linear time and uses linear extra space.*/

package arrays;

import java.util.Arrays;

public class MaxGapInArrayForItsSortedForm {

		public static void main(String[] args) {
			MaxGapInArrayForItsSortedForm ob = new MaxGapInArrayForItsSortedForm();
			int[] arr = {3,6,9,1};
			System.out.println(ob.maximumGap(arr));
		}
	    public int maximumGap(int[] nums) 
	    {
	        
	        int gap = 0;
	        Arrays.sort(nums);
	        if(nums.length<2)
	        { 
	            return gap;
	        }
	        else
	        {
	           for(int i=0;i<nums.length-1;i++){
	               if(gap>(nums[i+1]-nums[i])){
	                   
	               }
	               else gap = nums[i+1]-nums[i];
	           }
	        }
	        return gap;
	    }
	
}
