package com.training.day5;

public class RevArrayWithoutTempArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int len = arr.length;
        for (int i = 0, j = len-i-1; i < len/2; i++,j--)
        {
            arr[i] = arr[i] + arr[len-i-1];
            arr[len-i-1] = arr[i] - arr[len-i-1];
            arr[i] = arr[i] - arr[len-i-1];
        }
        //Using temp array
        for (int k=0; k < len; k++)
        {
            System.out.println(arr[k] + " ");
        }

    }
}
