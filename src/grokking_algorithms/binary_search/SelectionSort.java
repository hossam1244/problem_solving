package grokking_algorithms.binary_search;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 7;
        arr[3] = 1;
        int[] sortedArray = selectionSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    static int findSmallest(int[] arr) {
        // 5 4 8 2 1
        int smallest = arr[0];
        int smallestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    static public void removeElement(int[] arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }

    static int[] selectionSort(int[] arr) {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int smallest = findSmallest(arr);
            newArray[i] = smallest;
            removeElement(arr, smallest);
        }
        return newArray;
    }
}
