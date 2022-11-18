package com.kowatschpaul.ue5;

import java.util.Arrays;

public class exc8 {
    public static void main(String[] args) {
        int n = 1;
        int[] array = null;

        // TODO Put your method call here
        System.out.println(Arrays.toString(splitArray(array, n)));
    }

    // TODO Put your method definition here
    static int[] splitArray(int[] array, int n){
        int[] result = new int[0];
        if(array == null || n > array.length || n <= 0 || array.length == 0){
            return result;
        }
        else{
            result = new int[n];
            for(int i = 0; i < n; i++){
                result[i] = array[i];
            }
        }
        return result;
    }
}
