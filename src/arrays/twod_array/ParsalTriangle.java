
/*
 *  WAJP to print pascal triangle by using 2d array
 *     
 *  1
 *  1 1           (1)
 *  1 2 1         (1, 1+1, 1)
 *  1 3 3 1       (1, 1+2, 2+1, 1)
 *  1 4 6 4 1     (1, 1+3, 3+3, 3+1, 1)
 *  
 */

package arrays.twod_array;

public class ParsalTriangle {
	public static int[][] Pascaltriangle(int size){
		int[][] res = new int[size][];
		for(int i = 0; i<res.length; i++) {
			res[i] = new int[i+1];
			for(int j = 0; j<res[i].length; j++) {
				if(i==j || j==0) {
					res[i][j]=1;
				}
				else {
					res[i][j]= res[i-1][j-1]+res[i-1][j];
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[][] arr = Pascaltriangle(5);
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
