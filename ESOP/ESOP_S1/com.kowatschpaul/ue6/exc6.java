package com.kowatschpaul.ue6;

import java.util.Arrays;

public class exc6 {
    public static void main(String[] args) {
        int[][] array2d = new int[][]{{2, 0, 7, 5},{5, 9, 5, 8, 6},{1, 2}};
        // TODO Put your method call and output here
        int[] arr1Direction = convert2DTo1D(array2d);
        System.out.println(Arrays.toString(arr1Direction));
    }
    // TODO Put your method definition here
    static int[] convert2DTo1D(int[][] array2D){
        int[] result = new int[0];
        if(array2D != null && array2D.length != 0){
            int size = 0;
            for(int i = 0; i < array2D.length; i++){
                size += array2D[i].length;
            }
            result = new int[size];
            size = 0;
            for(int i = 0; i < array2D.length; i++){
                for(int k = 0; k < array2D[i].length; k++){
                    result[size] = array2D[i][k];
                    size++;
                }
            }
        }
        return result;
    }
}
