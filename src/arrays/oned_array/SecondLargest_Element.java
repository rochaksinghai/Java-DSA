package arrays.oned_array;

/*
 *    SecondLargest_Element in array
 */
public class SecondLargest_Element {
	public static void main(String[] args) {
		int[] arr = {12,65,4,15,64,1};
		int largest = -1;
		int secondlargest = -1;
		
		
		for(int i = 0; i<arr.length ;i++) {
			
			if(arr[i]>largest) {
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!=largest) {
				secondlargest = arr[i];
			}
		}
		System.out.println(secondlargest);
	}

}
