package com.kowatschpaul.ue8;

public class exc8 {
    public static void main(String[] args) {

            int[] arr = { 12, 1234, 456, 67, -1 };
            int n = arr.length;
            int i = 0;
            System.out.println(getMin(arr, i, n));

    }

    private static int getMin(int[] arr, int i, int n){
        if (i == n-1)
            return arr[0];
        else{
            int temp = getMin(arr, i, n-1 );
            if (temp <= arr[n-1])
                return  temp;
            else
                return arr[n-1];
        }
    }
}
