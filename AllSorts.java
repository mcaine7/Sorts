package sortpack;

/* This class contains Quicksort, Heapsort, Bubble sort, Selection Sort, Insertion Sort, and Mergesort as found in
 * Introduction to Algorithms 3rd Edition by Cormen, Leiserson, Rivest, and Stein; and from a collection of online sources
 * 
 * 
 * By: Matthew Caine
 * 
 * 
 * 
 * 
 * NOTE: This class will also contain assisting methods, for example the method 'merge' is necessary for mergesort, etc.
 *
 */
public class AllSorts {

	// Attempted to copy the psuedocode from pg 31 in the above textbook and
	// turn it into java code.
	public static void merge(int Arr[], int lo, int mid, int hi) {
		double inf = Double.POSITIVE_INFINITY;

		int n1 = mid - lo + 1; // length of sub array Arr[p..q]
		int n2 = hi - mid; // length of sub array Arr[q+1..r]
		int[] leftArr = new int[n1 + 1];
		int[] rightArr = new int[n2 + 1];

		for (int i = lo; i < n1; i++) { // Should copy subarray Arr[p..q] into
										// leftArr
			leftArr[i] = Arr[lo + i - 1];
		}
		for (int j = mid + 1; j < n2; j++) { // copy subarray Arr[q+1..r] into
												// rightArr
			rightArr[j] = Arr[mid + j];
		}
		// leftArr[n1+1] = (int) inf;
		// rightArr[n2+1] = (int) inf;
		int i = 1;
		int j = 1;
		for (int k = lo; k < hi; k++) {
			if (leftArr[i] <= rightArr[j]) {
				Arr[k] = leftArr[i];
				i = i + 1;
			} else {
				Arr[k] = rightArr[j];
				j = j + 1;
			}
		}
	}

	public static void merge2(int Arr[], int low, int mid, int hi) {
		int sentinel = 1000000000;
		int break1 = mid - low + 1;
		int break2 = hi - mid;
		int[] Larray = new int[break1 + 1];
		int[] Rarray = new int[break2 + 1];

		for (int i = 1; i < break1; i++) {
			Larray[i] = Arr[low + i - 1];
		}
		for (int j = 1; j < break2; j++) {
			Rarray[j] = Arr[mid + j];
		}
		Larray[break1 + 1] = sentinel;
		Rarray[break2 + 1] = sentinel;
		int i = 1;
		int j = 1;
		for (int k = low; k < hi; k++) {
			if (Larray[i] <= Rarray[j]) {
				Arr[k] = Larray[i];
				i = i + 1;
			} else {
				Arr[k] = Larray[i];
				j = j + 1;
			}
		}

	}

	// takes the floor int or largest int <= n
	public static int floor(int n) {
		return n - (n % 1);
	}

	// MERGESORT
	public static void mergeSort(int[] Arr, int low, int hi) {
		int mid = floor((low + hi) / 2);
		if (low < hi) {
			mergeSort(Arr, low, mid);
			mergeSort(Arr, mid + 1, hi);
			merge2(Arr, low, mid, hi);
		}
		// return merge(Arr, p, q, r);
	}

	// INSERTIONSORT
	public static int[] insertionSort(int A[]) {
		int j = 0;
		int key = 0;

		for (j = 1; j < A.length; j++) {
			key = A[j];
			int i = j - 1;
			while (i >= 0 && A[i] > key) {
				A[i + 1] = A[i];
				i = i - 1;
				A[i + 1] = key;
			}
		}
		return A;
	}

}
