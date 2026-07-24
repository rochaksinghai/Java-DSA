package pattern.star;

/*
 * Solid_Rombus_Pattern
 * 
 *    for this space we use (num - row) for each row so we 
 *      that we get all spaces line wise
 *      
 *      
 *     _ _ _ _ * * * * *
 *     _ _ _ * * * * *
 *     _ _ * * * * *
 *     _ * * * * *
 *     * * * * *
 *       
 */
public class Solid_Rombus {
	public static void main(String[] args) {
		int num = 5;
		for( int i = 1 ; i<=num; i++ ) {
			
			for( int j = 1 ;j <= num-i; j++ ) {
				System.out.print(" ");
			}
			
			for( int j = 1 ;j <= num; j++ ) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
