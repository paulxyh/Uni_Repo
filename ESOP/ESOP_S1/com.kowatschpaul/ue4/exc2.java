package com.kowatschpaul.ue4;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers;

        numbers = new int[n];
        if(n != 0){
            for(int i = 0; i < numbers.length; i++){
                numbers[i] = in.nextInt();
            }
            for(int i = (n-1); i >= 0; i--){
                if(i != 0)
                    System.out.print(numbers[i] + ",");
                else
                    System.out.print(numbers[i]);
            }
        }
    }
}
