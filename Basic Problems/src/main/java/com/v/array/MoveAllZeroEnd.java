package com.v.array;

import java.util.Arrays;

public class MoveAllZeroEnd {

    public static void main(String[] args) {

        int []arr={1, 0, 3, 0, 2};
//        unstableWay(arr);
        stableWayPreseveOrder(arr);
    }

    static void stableWayPreseveOrder(int []arr){
        int index = 0; // Pointer for placing non-zero elements

// Step 1: Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

// Step 2: Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }

// Print result
        System.out.println(Arrays.toString(arr));

    }

    static void unstableWay(int []arr){
        int end=arr.length-1;

        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                swapNum(arr,i,end);
                end--;
                i++;
            }
        }
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }

    private static void swapNum(int[] arr, int n1, int n2) {
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
}
