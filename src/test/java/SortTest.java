import org.junit.Test;

import java.util.Arrays;

import static sorting.BucketSort.bucketSort;
import static sorting.CyclicSort.cyclicSort;

public class SortTest {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        for(int k=0; k < 200; k++) {
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 50);
            }

            // Sort the array using the provided sorting function
            bucketSort(array, 6);

            // Test that the array is sorted correctly
            if (isSorted(array)) {
                System.out.println("Sorting function passed!");
            } else {
                System.err.println("Sorting function failed!");
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
