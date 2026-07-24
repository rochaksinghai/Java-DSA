package pattern.star;

/* 
 * formula u can use (num - row + 1)
 * 
 *  num5, r1, cl5
 *  num5, r2, cl4
 *  num5, r3, cl3
 *  num5, r4, cl2
 *  num5, r5, cl1
 * 
 *     * * * * *
 *     * * * *
 *     * * *
 *     * *
 *     *
 *     
 * 
 */

public class Solid_TRR_1 {
	public static void main(String[] args) {
		int num = 5;
		for(int i = 1 ; i<= num ; i++) {
			for(int j = 1 ; j<= num-i+1 ; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
