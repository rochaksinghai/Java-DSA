package pattern.star;
/*
 * Solid_Rightangle_Triangle
 *      *
 *      * *
 *      * * *
 *      * * * *
 *      * * * * *
 */
public class Solid_Rightangle_Triangle {
	public static void main(String[] args) {
		int num = 5;
		for(int i = 1 ; i<=num ; i++) {
			for(int j = 1; j<=i ;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}
}
