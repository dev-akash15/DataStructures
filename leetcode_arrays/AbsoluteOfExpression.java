
// 1131. Maximum of Absolute Value Expression |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|


/*Given two arrays of integers with equal lengths, return the maximum value of:

|arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|

where the maximum is taken over all 0 <= i, j < arr1.length.

 

Example 1:

Input: arr1 = [1,2,3,4], arr2 = [-1,4,5,6]
Output: 13
*/
package leetcode_arrays;

public class AbsoluteOfExpression {
	
		public static void main(String[] args) {
			AbsoluteOfExpression t = new AbsoluteOfExpression();
			int[] arr1 = {1,2,3,4};
			int[] arr2 = {-1,4,5,6};
			System.out.println(t.maxAbsValExpr(arr1, arr2));
		}
	    public int maxAbsValExpr(int[] arr1, int[] arr2) 
	    {
	        int[] case1 = new int[arr1.length];
	        int[] case2 = new int[arr1.length];
	        int[] case3 = new int[arr1.length];
	        int[] case4 = new int[arr1.length];
	        for(int i=0;i<arr1.length;i++)
	        {        
	                case1[i] = arr1[i]+arr2[i]+i;
	                case2[i] = arr1[i]+arr2[i]-i;
	                case3[i] = arr1[i]-arr2[i]+i;
	                case4[i] = arr1[i]-arr2[i]-i;       
	        }
	       int max1 = maxOfArray(case1)-minOfArray(case1);
	       int max2 = maxOfArray(case2)-minOfArray(case2);
	       int max3 = maxOfArray(case3)-minOfArray(case3);
	       int max4 = maxOfArray(case4)-minOfArray(case4);
	        
	        
	       return Math.max(max1, Math.max(max2, Math.max(max3, max4)));
	    }
	       public static int maxOfArray(int[] arr)
	       {
	            int max =Integer.MIN_VALUE;
	            for(int i=0;i<arr.length;i++){
	                if(arr[i]>max){
	                    max = arr[i];
	                }
	            }
	            return max;
	        }
	        public static int minOfArray(int[] arr)
	        {
	              int min =Integer.MAX_VALUE;
	            for(int i=0;i<arr.length;i++){
	                if(arr[i]<min){
	                    min = arr[i];
	                }
	            }
	            return min;
	        }

	    
	
}
