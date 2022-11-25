package com.kowatschpaul.ue6;

public class exc11 {
    public static void main(String[] args){
        int size = 7;
        char[][] hourglass = createHourglass(size);

        // print the output
        for(char[] row: hourglass){
            for(char ch: row){
                System.out.print(ch);
            }
            System.out.print("\n");
        }
    }

    // TODO Define your method here
    static char[][] createHourglass(int size){
        char[][] result = new char[size][size];
        for(int i = 0; i < size; i++){
            for(int k = 0; k < size; k++){
                if(k >= i && k <= size - i - 1){
                    result[i][k] = '*';
                }
                else{
                    result[i][k] = ' ';
                }
            }
        }
        for(int i = 0; i < size; i++){
            for(int k = 0; k < size; k++){
                if(k >= i && k <= size-i-1){
                    result[size-i-1][k] = '*';
                }
            }
        }
        return result;
    }
    /*
    * public static void main(String[] args){
        int size = 5;
        char[][] hourglass = createHourglass(size);

        // print the output
        for(char[] row: hourglass){
            for(char ch: row){
                System.out.print(ch);
            }
            System.out.print("\n");
        }
    }

    // TODO Define your method here
    static char[][] createHourglass(int size){
        char[][] result = new char[size][size];
        int split = size / 2;
        for(int i = 0; i < size; i++){
            for(int k = 0; k < size; k++){
                if(k >= i && k <= size - 1 - i){
                    result[i][k] = '*';
                }
                else{
                    result[i][k] = ' ';
                }
            }
        }
        for(int i = 0; i < split; i++){
            for(int k = i; k < size -i; k++){
                if(k >= i && k <= size-i){
                    result[size-i-1][k] = '*';
                }
            }
        }
        return result;
    }*/
}
