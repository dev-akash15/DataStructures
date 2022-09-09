
// 1572. Matrix Diagonal Sum

/*Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and 

all the elements on the secondary diagonal that are not part of the primary diagonal.
*/
package leetcode_arrays;

public class MatrixDiagonalSum {

	    public int diagonalSum(int[][] mat) {
	           int length = mat.length;
	        int primarySum =0;
	        int secondarySum =0;
	        
	        for(int i=0;i<length;i++)
	        {
	            for(int j=0;j<length;j++)
	            {
	                if(i==j){
	                    primarySum+=mat[i][j];
	                }    
	                else if((i+j)==length-1)
	                {
	                    secondarySum+=mat[i][j];
	                } 
	            }
	        }
	        return primarySum+secondarySum;
	    }
	    public static void main(String[] args) {
	    	int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
	    	
	    	MatrixDiagonalSum obj = new MatrixDiagonalSum();
	    	int result  = obj.diagonalSum(mat);
	    	System.out.println("The diagonal sum without repeating intersected values is "+result);
	    }
}
