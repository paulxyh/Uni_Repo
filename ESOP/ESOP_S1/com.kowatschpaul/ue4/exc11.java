package com.kowatschpaul.ue4;

import java.util.Scanner;

public class exc11 {
    public static void main(String[] args) {
        int[] sorted1 = { 1, 3, 5};
        int[] sorted2 = { 4, 6, 8 };
        int[] result;
        // TODO Put your code here
        result = new int[sorted1.length + sorted2.length];

        int x = 0;
        int y = 0;

        for (int i = 0; i < result.length; i++){
            result[i] = (y >= sorted2.length || x < sorted1.length && sorted1[x] < sorted2[y]) ? sorted1[x] : sorted2[y];
            x = (x < sorted1.length && result[i] == sorted1[x] ? x + 1 : x);
            y = (y < sorted2.length && result[i] == sorted2[y] ? y + 1 : y);
        }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
