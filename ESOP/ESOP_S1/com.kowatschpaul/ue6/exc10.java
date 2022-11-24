package com.kowatschpaul.ue6;

public class exc10 {
    public static void main(String[] args){
        int n = 8;
        // TODO put your method call here
        print2DArray(createStrangeChessBoard(n));
    }

    // TODO put your method definition here
    static String[][] createStrangeChessBoard(int n){
        String[][] chessBoard = new String[0][0];
        if(n < 1 || n > 26){
            return chessBoard;
        }
        else{
            chessBoard = new String[n][n];
            for(int i = 0; i < n; i++){
                for(int k = 0; k < n; k++){
                    char alph = (char) (65+k);
                    chessBoard[i][k] = String.valueOf(alph) + String.valueOf((n-i));
                }
            }
            return chessBoard;
        }
    }

    static void print2DArray(String[][] array) {
        if(array == null || array.length == 0) {
            System.out.println("empty");
        }else{
            for (String[] a : array){
                printArray(a);
            }
        }
    }

    static void printArray(String[] toPrintArray){
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
