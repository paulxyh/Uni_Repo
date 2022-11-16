package com.kowatschpaul.ue4;

import java.util.Scanner;

public class exc10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers;
        short[] counters;
        // TODO Put your code here

        try
        {
            counters = new short[9];
            numbers = new int[n];
            for(short i = 0; i < 9; i++){
                counters[i] = 0;
            }
            if(n!=0){
                n = 0;
                int y = 1;
                while(n < numbers.length && y != 0){
                    y = in.nextInt();
                    numbers[n] = y;
                    n++;
                }
                for(short i = 0; i < 9; i++){
                    for(int z = 0; z < numbers.length; z++){
                        if((i+1) == numbers[z]){
                            counters[i] += 1;
                        }
                    }
                }
            }
            for(short i = 0; i < 9; i++){
                System.out.println("Die Zahl " + (i+1) + " kommt " + counters[i] + "-mal vor.");
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }



    }
}
