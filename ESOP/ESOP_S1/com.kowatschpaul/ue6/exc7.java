package com.kowatschpaul.ue6;

public class exc7 {
    public static void main(String[] args){
        int n = 4;
        // TODO Put your method call here
        int[][] cd = arrayCountDown(n);
        print2DArray(cd);
    }

    // TODO Put your method definition here

    static int[][] arrayCountDown(int n){
        int[][] arr = new int[0][0];
        if(n < 1){
            return arr;
        }
        else{
            arr = new int[n][];
            for(int i = n; i > 0; i--){
                arr[n-i] = new int[i];
                for(int k = 0; k < i; k++){
                    arr[n-i][k] = i;
                }
            }
            return arr;
        }
    }
    // Use method print2DArray to print the content of
    // a 2D-int Array on System.out.
    static void print2DArray(int[][] array){
        if(array == null || array.length == 0){
            System.out.println("empty");
        }else{
            for (int[] a : array){
                printArray(a);
            }
        }
    }

    static void printArray(int[] toPrintArray){
        if(toPrintArray == null || toPrintArray.length == 0){
            System.out.println("empty");
        }else{
            int counter = 0;
            System.out.print("[");
            while(counter < toPrintArray.length-1){
                System.out.print(toPrintArray[counter++]+", ");
            }
            System.out.println(toPrintArray[counter]+"]");
        }
    }
}
