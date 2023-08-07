package Algorithmus4;

import java.util.Arrays;

import static practice2.MergeSort.mergeSort;


public class HomeworkMergeSort {
    public static void main(String[] args) {
        int[] unsortedArray = {45, 67, 12, 96, 8, 33, 72};
        mergeSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static int[] merge(int [] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return arr;
    }
}
