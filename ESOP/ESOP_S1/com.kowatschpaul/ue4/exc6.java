package com.kowatschpaul.ue4;

import java.util.Scanner;

public class exc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int[] numbers;
        // TODO Put your code here
        numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        int i = 0;
        while(i < n){
            if ((numbers[i] % a == 0 && numbers[i] % b == 0) == true || numbers[i] % b == 0) {
                System.out.print(numbers[i] + " ");
                i += 3;
            } else if (numbers[i] % a == 0) {
                System.out.print(numbers[i] + " ");
                i += 2;
            }
            else {
                System.out.print(numbers[i] + " ");
                i++;
            }
        }

    }
}
