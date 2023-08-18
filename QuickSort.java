package Algorithmus5;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[]arr){
        if (arr.length<=1)return arr;
        int pivot = arr[arr.length-1];
        int[]left = new int[arr.length];
        int[]right = new int[arr.length];
        int leftInfex = 0;
        int rightInfex = 0;

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]<pivot){
                left[leftInfex++] = arr[i];
            }
            else {
                right[rightInfex++] = arr[i];
            }
        }
        left = Arrays.copyOf(left,leftInfex);
        right = Arrays.copyOf(right,rightInfex);

        int[] sortedLeft = quickSort(left);
        int[] sortedRight = quickSort(right);
        int[] result = new int[sortedLeft.length+sortedRight.length+1];
        System.arraycopy(sortedLeft,0,result,0,sortedLeft.length);
        result[sortedLeft.length] = pivot;
        System.arraycopy(sortedRight,0,result,sortedLeft.length+1,sortedRight.length);
        return result;
    }

    public static void main(String[] args) {
        int[]arr = {1, 5, 7, 34, 51, 44, 2, 9};
        int[]sortedArr = quickSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
