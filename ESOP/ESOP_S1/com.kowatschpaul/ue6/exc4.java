package com.kowatschpaul.ue6;

import java.util.Arrays;

public class exc4 {
    public static void main(String[] args){
        int[][] myMatrix = {{1,2,3,4},{17,9,5,6},{1,1,1,1},{7,6,5,4}};
        int[] diagonal = getDiagonal(myMatrix);
        System.out.println(Arrays.toString(diagonal));
    }
    static int[] getDiagonal(int[][] matrix){
        int[] result = new int[0];
        if(isRectangular(matrix)){
            result = new int[matrix[0].length];
            for(int i = 0; i < matrix.length; i++){
                result = matrix[i];
            }
        }
        return result;
    }
    static boolean isRectangular(int[][] arr) {
        boolean bool = true;
        if (arr != null){
            if(arr.length != 0){
                int size = arr[0].length;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length != size) {
                        bool = false;
                        break;
                    }
                }
            }
        }
        else{
            bool = false;
        }
        return bool;
    }
}
