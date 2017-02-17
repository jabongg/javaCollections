
/**
 * Created by ejangpa on 1/31/2017.
 */
public class QuickSortImpl {
    public static void main(String[] args) {
		int[] A = {12, 4, 3, 46, 23, 98, 78, 65};
		QuickSortImpl quickObj = new QuickSortImpl();
		int start = 0; 
		int end = A.length - 1;
		quickObj.printElements(A);
		quickObj.quickSort(A, start, end);
		quickObj.printElements(A);
    }
	
	/**
	* sorts the elements of the array A
	*/
	public void quickSort(int[] A, int start, int end) {
		//setting for base condition
		if (start < end) {
			int pIndex = partition(A, start, end);
			quickSort(A, start, pIndex - 1);
			quickSort(A, pIndex + 1, end);
		}
	}
	
	/**
	 * This method prints array elements
	 * 
	 */
	 public void printElements(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	 }
	
	/**
	 * Partitions the array in two halves . 
	 * One  half containing elements less than pivot and other having greater than pivot .
	 */
	public int partition(int[] A, int start, int end) {
		int pivot = A[end];
		int pIndex = start;
		
		for (int i = start; i < end - 1; i++) {
			if (A[i] <= pivot) {
				swap(A, i , pIndex);
				pIndex = pIndex + 1;
			}
		}
		swap(A, pIndex, end);
		return pIndex;
	}
	
	public void swap(int[] A, int i, int pIndex) {
		int temp;
		temp = A[i];
		A[i] = A[pIndex];
		A[pIndex] = temp;
	}
}