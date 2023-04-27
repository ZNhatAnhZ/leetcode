package sorting;

public class CyclicSort {
    public static int[] cyclicSort(int[] array) {
        for(int i=0; i < array.length; i++) {
            int currentElement = array[i];
            int position;

            do {
                position = i;
                for(int j = i+1; j < array.length; j++) {
                    //find the sorted position of the current element
                    if (currentElement > array[j]) {
                        position++;
                    }
                }

                //check to see if this is the same element
                if (i == position && currentElement == array[position]) {
                    break;
                }

                //add duplicate element behind each other
                while(currentElement == array[position]) {
                    position++;
                }

                //swapping elements with a var and a position inside the array
                int temp = array[position];
                array[position] = currentElement;
                currentElement = temp;
            } while (i != position);

        }
        return array;
    }
}
