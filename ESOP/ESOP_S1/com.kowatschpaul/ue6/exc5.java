package com.kowatschpaul.ue6;

public class exc5 {
    public static void main(String[] args){
        //TODO Put your code here
        printArray(initArray(1, 1), '.');
        System.out.println();
        printArray(initArray(2,2), '|');
        System.out.println();
        printArray(initArray(3,5), ' ');
    }

    static int[][] initArray(int rows, int columns){
        //TODO Implement your method here
        int[][] result = new int[rows][columns];
        int z = 0;
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < columns; k++){
                result[i][k] = z++;
            }
        }
        return result; // Change this to the required return value!
    }

    static void printArray (int[][] array, char separator){
        //TODO Implement your method here
        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++){
                if(k == array[i].length -1){
                    System.out.print(array[i][k]);
                    System.out.println(separator);
                }
                else{
                    System.out.print(array[i][k]);
                    System.out.print(separator);
                }
            }
        }
    }
}
