package com.training.day16;

public class ConsReplace {
    public static void main(String[] args) {
        String arr[] = new String[3];
        arr[0] = "Hello";
        arr[1] = "world";
        arr[2] = "Helloo";

        for(int i=0;i<arr.length;i++)
        {
            char[] charArr = arr[i].toCharArray();
            int j=1;
            for(j=1;j< charArr.length;j++)
            {
                if(charArr[j] == charArr[j-1])
                {
                    charArr[j] = 'x';
                   // break; - Need not break if all the second repetition chars needs to be replaced by x.
                }

            }
            System.out.println(charArr);
        }
    }
}
