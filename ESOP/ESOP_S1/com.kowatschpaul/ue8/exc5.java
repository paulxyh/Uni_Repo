package com.kowatschpaul.ue8;

import java.util.Scanner;

public class exc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        for (int i = 0; i < 10; ++i) {
            int count = countDigit(number, i);
            if (count > 0) {
                System.out.println(i + " kommt " + count + " mal vor.");
            }
        }
    }
    //Your method will be inserted here.
    static int countDigit(long num, int i){
        int count = 0;
        if(num != 0){
            if(num % 10 == i){
                count++;
            }
            return count + countDigit(num/10, i);
        }
        else return 0;
    }
}
