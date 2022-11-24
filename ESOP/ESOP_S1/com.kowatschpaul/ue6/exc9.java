package com.kowatschpaul.ue6;

public class exc9 {
    static int[][] matrix = new int[][] {{1,0,2,0,0}, {2,8,0,0,0},
            {5,3,1,0,0}, {0,1,3,2,0}, {1,9,1,1,2}};

    public static void main(String[] args){
        if(isLowerTriangular(matrix)){
            System.out.println("The matrix is lower triangular!");
        }else{
            System.out.println("The matrix is NOT lower triangular!");
        }
    }

    // TODO Define your method here
    static boolean isLowerTriangular(int[][] matrix){
        boolean bool = true;
        if(matrix == null){
            bool = false;
        } else if (matrix.length == 0) {
            bool = true;
        }else{
            for(int i = 0; i < matrix.length; i++){
                for(int k = 0; k < matrix.length; k++){
                    if(k > i && matrix[i][k] != 0){
                        bool = false;
                    }
                }
            }
        }
        return bool;
    }
}
