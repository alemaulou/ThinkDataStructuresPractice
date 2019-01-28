package Chapter2;

import java.util.Arrays;

public class SelectionSort {

    /* Swaps elements at indexes i and j */
    
    public static void swapElements(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /* Find the index of the lowest value
     * starting from the index at start (inclusive)
     * and going to the end of the array.
     */
    
    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }
    
    /* Sorts the elements in place using Selection sort */
    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
        return array;
    }
    
    public static void main(String[] args) {
        int[] array = {10,2,4,3};
        System.out.println("Original array: " + Arrays.toString(array));
        
        /* Not cute! */
        System.out.print("Sorted array, printed utilizing an interator: [");
        for(int e : array) {
            System.out.print(e);
            System.out.print(" , ");
        }
        System.out.println("]");
        
        System.out.println("Sorted array: " +Arrays.toString(selectionSort(array)));
    }
}
