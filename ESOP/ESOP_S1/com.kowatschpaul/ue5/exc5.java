package com.kowatschpaul.ue5;

import java.util.Arrays;

public class exc5 {
    public static void main(String[] args) {
        int myInt = 42;
        int[] myArray = new int[] {1, 2, 3};

        // TODO Put your method calls here
        increment(myInt);
        increment(myArray);

        System.out.println("----------");
        System.out.println(myInt);
        System.out.println(Arrays.toString(myArray));
    }
    static void increment(int i){
        i += 1;
        System.out.println(i);
    }

    static void increment(int[] arr){
        if(arr == null)
            System.out.println("null");
        else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += 1;

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
