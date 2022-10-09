
// 42. Trapping Rain Water using arrays

/*Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.*/

package arrays;

public class TrappingRainWater2 {

	public static void main(String[] args) {
		TrappingRainWater2 t = new TrappingRainWater2();
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(t.trap(arr));
	}

		public int trap(int[] height) {

			int n = height.length;
			int[] maxLeft = new int[n];
			int[] maxRight = new int[n];
			int[] min = null;
			maxLeft = findMaxLeft(height, 0, maxLeft, n);
			maxRight = findMaxRight(height, 0, maxRight, n);
			min = minOfLeftAndRightMax(maxLeft, maxRight);
			int totalWaterStored = findWaterStored(min, height);
			return totalWaterStored;
		}

		public int findWaterStored(int[] min, int[] height) {

			int[] difference = new int[min.length];

			for (int i = 0; i < min.length; i++) {

				difference[i] = min[i] - height[i];
			}

			int total = 0;
			for (int i = 0; i < difference.length; i++) {
				if (difference[i] > 0) {
					total += difference[i];
				}
			}
			return total;
		}

		public int[] findMaxLeft(int[] height, int firstValue, int[] maxLeft, int lengthOfArray) {

			maxLeft[0] = firstValue;
			int max = maxLeft[0];

			for (int i = 0; i < lengthOfArray - 1; i++) {
				if (height[i] > max) {
					max = height[i];
				}
				maxLeft[i + 1] = max;
			}

			return maxLeft;
		}

		public int[] findMaxRight(int[] height, int lastValue, int[] maxRight, int lengthOfArray) {

			maxRight[lengthOfArray - 1] = lastValue;
			int max = maxRight[lengthOfArray - 1];

			for (int i = lengthOfArray - 1; i > 0; i--) {
				if (height[i] > max) {
					max = height[i];
				}
				maxRight[i - 1] = max;
			}

			return maxRight;
		}

		public int[] minOfLeftAndRightMax(int[] maxLeft, int[] maxRight) {
			int[] min = new int[maxLeft.length];

			for (int i = 0; i < maxLeft.length; i++) {
				if (maxLeft[i] < maxRight[i]) {
					min[i] = maxLeft[i];
				} else
					min[i] = maxRight[i];
			}

			return min;
		}

	
}
