/*
 * Dylan Vander Berg
 * Lab Exercise 6
 * 1 - Array Methods
 */
package lab6;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] array = {1, 3, 6, 3, 2, 4, 2, 2, 5, 6, 2, 35, 4, 32, 53, 46, 34, 3, 6, 3, 4, 3, 5, 3, 4, 4, 543};
		System.out.println("lastIndexOf(array, 3) is: " + lastIndexOf(array, 3));
		System.out.println("range(array) is: " + range(array));
		System.out.println("countInRange(array, 3, 6) is: " + countInRange(array, 3, 6));
	}
	
	/**
	 * 
	 * @param array - array passed in
	 * @param value - value of array element to search for
	 * @return - index of last occurrence of value
	 */
	public static int lastIndexOf(int[] array, int value){
		int currentIndex = -1;//default return is -1
		for(int i = 0; i < array.length; i++){//loop through array and set currentIndex whenever a new element has a value of value
			if(array[i] == value){
				currentIndex = i;
			}
		}
		return currentIndex;
	}
	
	/**
	 * 
	 * @param array - array passed in
	 * @return - range of int values in array (max - min + 1)
	 */
	public static int range(int[] array){
		int min = Integer.MAX_VALUE;//set min to maximum integer value to make sure that min is set by a lower number
		int max = 0;//set max to 0 to make sure that max is set by a higher number
		for(int i = 0; i < array.length; i++){//loop through array and find max and min
			if(array[i] < min){
				min = array[i];
			}
			if(array[i] > max){
				max = array[i];
			}
		}
		return max - min + 1;
	}
	
	/**
	 * 
	 * @param array - array passed in
	 * @param min - minimum value of range for comparison
	 * @param max - maximum value of range for comparison
	 * @return - number of array elements between min and max
	 */
	public static int countInRange(int[] array, int min, int max){
		int count = 0;
		for(int i = 0; i < array.length; i++){//loop through array and count whenever a value is between min and max
			if(array[i] <= max && array[i] >= min){
				count++;
			}
		}
		return count;
	}

}
