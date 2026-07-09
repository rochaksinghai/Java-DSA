package arrays.twod_array;

/* 
 *  Multiplication of two matrix 
 */


public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{1,2,1},{2,0,1}};
		int[][] b = {{5,4,7},{0,0,5},{1,2,1}};
		int[][] res = new int[a.length][a.length];
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0 ; j<a[i].length;j++) {
				for (int k = 0; k < a[0].length; k++) {
			        	res[i][j] += a[i][k] * b[k][j];
			        }
			}
		}
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0 ; j<a[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
