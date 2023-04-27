package org.example.sorting;

public class CyclicSort {
    public static int[] cyclicSort(int[] array) {
        for(int i=0; i < array.length; i++) {
            int currentElement = array[i];
            int position;

            do {
                position = i;
                for(int j = i+1; j < array.length; j++) {
                    if (currentElement > array[j]) {
                        position++;
                    }
                }

                if (i == position && currentElement == array[position]) {
                    break;
                }

                while(currentElement == array[position]) {
                    position++;
                }

                int temp = array[position];
                array[position] = currentElement;
                currentElement = temp;
            } while (i != position);

        }
        return array;
    }
}
