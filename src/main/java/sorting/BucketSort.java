package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void bucketSort(int[] array, int numOfBuckets) {
        // initialize buckets
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(numOfBuckets);
        int maxValue = -9999;

        // find max value in the array
        for (int i = 0; i < array.length; i++) {
            maxValue = Math.max(maxValue, array[i]);
        }

        maxValue++;

        // initialize empty list for each bucket
        for (int i = 0; i < numOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int j : array) {
            int bucketIndex = (int) Math.floor(numOfBuckets * j / maxValue); // put numbers to the right bucket
            buckets.get(bucketIndex).add(j);
        }

        // sort each bucket
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // put number from each bucket back into the array
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for(Integer value : bucket) {
                array[index++] = value.intValue();
            }

        }
    }
}
