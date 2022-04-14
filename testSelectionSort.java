import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {

	SelectionSort temp1 = new SelectionSort();

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	public void testPositive() {
	}

	public void testNegative() {
	}

	public void testMixed() {
		int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        temp1.basicSelectionSort(arr);
        Assert.assertArrayEquals(arr, Sortedarr);
	}

	public void testDuplicates() {
		int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 8;
        arr[3] = 10;
        arr[4] = 5;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 5;
        Sortedarr[1] = 5;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        temp1.basicSelectionSort(arr);
        Assert.assertArrayEquals(arr, Sortedarr);
	}
}
