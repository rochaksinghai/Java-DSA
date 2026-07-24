package pattern.star;

/*
 *    
 *     _ _ _ _ *
 *     _ _ _ * * *
 *     _ _ * * * * *
 *     _ * * * * * * *
 *     * * * * * * * * *
 *     
 *     num5, r1, 4sp, 1*
 *     num5, r1, 3sp, 3*
 *     num5, r1, 2sp, 5*
 *     num5, r1, 1sp, 7*
 *     num5, r1, 0sp, 9*
 *     
 *    for space (num - row)
 *    for pyramid ( 2*row - 1)
 */

public class Solid_Pyramid_pattern {
	public static void main(String[] args) {
		int num = 5;
		for(int i = 1; i<=num ; i++) {
			
			for(int j = 1 ; j<=num-i ; j++) {
				System.out.print("  ");
			}
			for(int j = 1 ; j<= 2*i - 1; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}
