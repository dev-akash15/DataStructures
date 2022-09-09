
// 42. Trapping Rain Water using arrays and stacks

/*Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.*/

package leetcode_arrays;

import java.util.Stack;

public class TrappingRainWater1 {

		public static void main(String[] args) {
			TrappingRainWater1 t = new TrappingRainWater1();
			int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
			System.out.println(t.trap(arr));
		}
		   
	    public int trap(int[] height)
	    {

		return  sumOfArrayPositiveElements(
	            diffOfHeightMaxLeftRight(
	                  minOfLeftRight(maxLeft(height), maxRight(height))
	                , height));
		}

		public int[] maxLeft(int[] height) {
			Stack<Integer> s = new Stack<>();
			int[] maxL  = new int[height.length];
			
			for(int i=0;i<height.length;i++) {
				
				if(s.isEmpty()) {
					maxL[i] = 0;
					s.push(height[i]);
				}
				else {
					if(s.peek()<height[i]) {
						s.push(height[i]);
						maxL[i] = height[i];
					}
					else maxL[i] = s.peek();
				}
			}
			return maxL;
		}

		public int[] maxRight(int[] height) {
			Stack<Integer> s = new Stack<>();
			int[] maxR  = new int[height.length];
			
			for(int i=height.length-1;i>=0;i--) {
				if(s.isEmpty()) {
					maxR[i] = 0;
					s.push(height[i]);
				}
				else {
					if(s.peek()<height[i]) {
						s.push(height[i]);
						maxR[i] = height[i];
					}
					else maxR[i] = s.peek();
				}
			}
			return maxR;
		}

		public int[] diffOfHeightMaxLeftRight(int[] arr1,int[] arr2) {
			
			int[] diff = new int[arr1.length];
			
			for(int i=0;i<arr1.length;i++) {
				diff[i] = arr1[i]-arr2[i];
			}
			return diff;
		}
		
		public int[] minOfLeftRight(int[] arr1, int[] arr2) {
			int[] res = new int[arr1.length];
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] < arr2[i]) {
					res[i] = arr1[i];
				} else {
					res[i] = arr2[i];
				}
			}
			return res;
		}

		public int sumOfArrayPositiveElements(int[] arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 0) {
					sum += arr[i];
				}
			}
			return sum;
		}

	
}
