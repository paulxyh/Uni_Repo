package com.kowatschpaul.ue5;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        int[] input = new int[3];
        int result = 0;
        Scanner in = new Scanner(System.in);

        //Einlesen der Inputs
        for(int i = 0; i < input.length; i++){
            input[i] = in.nextInt();
        }
        //Addieren der Inputs und speichern in result
        result = addition(input[0], input[1], input[2]);
        System.out.println(result);
    }

    static int addition(int a, int b, int c){
        return (a + b + c);
    }
}
