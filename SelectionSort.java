public class SelectionSort {
	private int temp;

	/** Creates a new instance of SelectionSort */
	public SelectionSort() {
	}

	/* A simple SelectionSort algorithm
	 * Pre-condition: an unsorted list of integers
	 * Post-condition: a sorted list of integers
	 * Inputs: integers, positive, negative, mixed, zero
	 * Outputs: sorted integers of specified types
	 * Special Conditions: n/a
	 */
	public int[] basicSelectionSort(int[] x) {
		for (int i = 0; i < x.length; ++i) {
			for (int j = i+1; j < x.length; ++j) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			} // end of inner for loop
		} // end of outer for loop
		return x;
	} // end of basicSelectionSort method
}
