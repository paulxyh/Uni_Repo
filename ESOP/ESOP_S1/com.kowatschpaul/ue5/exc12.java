package com.kowatschpaul.ue5;

import java.util.Arrays;

public class exc12 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{9, 6, 4, 2, 0, 12};

        int[] resultArray = intersection(array1, array2);

        System.out.println(Arrays.toString(resultArray));
    }

    static int[] intersection(int[] arr1, int[] arr2){
        int[] res = new int[0];
        int[] tmp = (arr1.length > arr2.length) ? new int[arr1.length] : new int[arr2.length];
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int z = 0; z < arr2.length; z++){
                if (arr1[i] == arr2[z]){
                    tmp[count] = arr1[i];
                    count++;
                }
            }
        }
        res = new int[count];
        for(int i = 0; i < count; i++){
            res[i] = tmp[i];
        }

        return res;
    }
}
