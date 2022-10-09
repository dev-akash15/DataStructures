
// 59. Spiral Matrix II

/*Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.*/



package arrays;

public class GeneratingSpiralMatrix {

	public static void main(String[] args) {
		GeneratingSpiralMatrix obj = new GeneratingSpiralMatrix();
		int[][] matrix = obj.generateMatrix(3);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	    public int[][] generateMatrix(int n) {
	     		int top = 0;
			int bottom = n - 1;
			int left = 0;
			int right = n - 1;
			int dir = 1;
			int count =1;
			int[][] spiralMatrix = new int[n][n];

			while (left <= right && top <= bottom) {

				if (dir == 1) 
				{
					for (int i = left; i <= right; i++)
					{
						spiralMatrix[top][i] = count;
						count++;
					}
					dir = 2;
					top++;
				}

				else if (dir == 2) 
				{
					for (int i = top; i <= bottom; i++) 
					{
						spiralMatrix[i][right]=count;
						count++;
					}
					dir = 3;
					right--;
				}

				else if (dir == 3) 
				{
					for (int i = right; i >= left; i--) 
					{
						spiralMatrix[bottom][i]=count;
						count++;
					}

					dir = 4;
					bottom--;
				} 
				else if (dir == 4) 
				{
					for (int i = bottom; i >= top; i--) 
					{
						spiralMatrix[i][left]=count;
						count++;
					}
					left++;
	                dir=1;
				}
			}
			return spiralMatrix;
		}
	
}
