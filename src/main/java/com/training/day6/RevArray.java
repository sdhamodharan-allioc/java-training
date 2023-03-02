package com.training.day6;

public class RevArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int len = arr.length;
        int revarr[] = new int[arr.length];
        for (int i = 0, j = len - i - 1; i < len; i++,j--) {

            revarr[j] = arr[i];
        }

        //Using temp array
        for (int k=0; k < len; k++)
        {
            System.out.println(revarr[k] + " ");
        }

    }
}
