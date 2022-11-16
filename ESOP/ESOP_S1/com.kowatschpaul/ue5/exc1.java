package com.kowatschpaul.ue5;

import java.util.Arrays;

public class exc1 {
    public static void main(String[] args) {
        int paramInt = 123;
        char paramChar = 'c';
        int[] paramIntArray = {1, 2, 3, 4, 5};

        // TODO Put your method calls here
        methodWithoutParameter(); //Method 1 Call
        methodInt(paramInt); // Method 2 Call
        methodIntArray(paramIntArray); //Method 3 Call
        methodCharIntArray(paramChar, paramIntArray);//Method 4 Call
        paramChar = methodReturnChar(paramIntArray, paramChar); //Method 5 call return char
        paramIntArray = methodReturnArray(paramChar, paramIntArray); //Method 6 call return int[]
        System.out.println(paramChar);
        System.out.println(Arrays.toString(paramIntArray));
    }

    // TODO Put your method definitions here
    static void methodWithoutParameter(){

    }

    static void methodInt(int i){

    }

    static void methodIntArray(int[] arr){

    }

    static void methodCharIntArray(char c, int[] arr){

    }

    static char methodReturnChar( int[] arr, char c){
        return c;
    }

    static int[] methodReturnArray(char c, int[] arr){
        return arr;
    }
}
