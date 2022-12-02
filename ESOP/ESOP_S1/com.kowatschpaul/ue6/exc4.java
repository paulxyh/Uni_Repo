package com.kowatschpaul.ue6;

import java.util.Arrays;

public class exc4 {
    public static void main(String[] args){
        int[][] myMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] diagonal = getDiagonal(myMatrix);
        System.out.println(Arrays.toString(diagonal));
    }
    static int[] getDiagonal(int[][] matrix){
        int[] result = new int[0];
        if(isRectangular(matrix)){
            result = new int[matrix[0].length];
            for(int i = 0; i < matrix.length; i++){
                result[i] = matrix[i][i];
            }
        }
        return result;
    }
    static boolean isRectangular(int[][] arr) {
        boolean bool = true;
        if (arr != null){
            if(arr.length != 0 && arr.length == arr[0].length){
                int size = arr[0].length;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length != size) {
                        bool = false;
                        break;
                    }
                }
            }
            else{
                bool = false;
            }
        }
        else{
            bool = false;
        }
        return bool;
    }
}
