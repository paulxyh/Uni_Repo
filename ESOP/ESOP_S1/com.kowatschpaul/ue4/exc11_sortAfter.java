package com.kowatschpaul.ue4;

import java.util.Arrays;

public class exc11_sortAfter {
    public static void main(String[] args) {
        int[] sorted1 = { 1, 2, 3};
        int[] sorted2 = { 4, 6, 8 };
        int[] result;
        // TODO Put your code here
        result = new int[sorted1.length + sorted2.length];

        for(int i = 0; i < sorted1.length; i++){
            result[i] = sorted1[i];
        }

        for(int i = 0; i < sorted2.length; i++){
            result[sorted1.length + i] = sorted2[i];
        }

        Arrays.sort(result);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
