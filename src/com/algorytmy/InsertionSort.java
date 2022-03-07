package com.algorytmy;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int tmp;
        int j;
        for(int i = 1; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr));
            tmp = arr[i]; // 3
            j = i - 1; // 5
            while(j >= 0 && arr[j] > tmp) {  // true (1) && 5 > 3 true
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = tmp;
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 4};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }
}
