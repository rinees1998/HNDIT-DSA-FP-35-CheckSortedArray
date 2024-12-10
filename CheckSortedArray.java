package rinees;

public class CheckSortedArray {

	public static void main(String[] args) {
		
		 int[] array = {1, 2, 3, 4, 5}; 
	        boolean isSorted = isArraySorted(array);
	        System.out.println(isSorted); 
	    }

	    public static boolean isArraySorted(int[] array) {
	       
	        if (array == null || array.length <= 1) {
	            return true; 
	        }

	       
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] > array[i + 1]) {
	                return false; 
	            }
	        }

	        return true;
	}

}
