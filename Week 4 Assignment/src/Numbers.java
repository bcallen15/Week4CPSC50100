//*********************************************
//	Numbers.java		Author: Ben Callen
//
//	Accepts an array and returns the next
//	largest number in the array, if one exists
//*********************************************

public class Numbers {
	
	public static void nextLargest(int array[]) {
		int largest;
		
		//Nested for loop that compares two instances of the array to
		//compare whether the next value in the array is larger
		for (int i = 0; i<array.length; i++) {
			largest = Integer.MAX_VALUE; //initializes largest as the max value for integer
			for (int x = 0; x<array.length; x++) {
				if (array[i]<array[x] && array[x]<largest) {
					largest = array[x];
				}
			}
			//uses the first instance of the array as the base number to compare to
			System.out.print(array[i] + ":" + largest + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = {10, 8, 77, 64, 3, 147, 99, 54};
		nextLargest(array);

	}

}
