package com.kowatschpaul.ue5;

import java.util.Scanner;

public class exc11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int number = in.nextInt();
            for(int i = 0; i <= number; i++)
                System.out.println(i + "! = " + factorial(i));
        }
        catch(Exception e){
            System.out.println("Not defined!");
        }


    }

    static long factorial(int n){
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}
