package com.kowatschpaul.ue4;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers;

        numbers = new int[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
        for(int i = n; i > 0; i--){
            System.out.print(numbers[i-1] + " ");
        }

    }
}
