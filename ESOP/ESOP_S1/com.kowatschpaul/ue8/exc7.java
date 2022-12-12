package com.kowatschpaul.ue8;

import java.util.Scanner;

public class exc7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.print(calcRecursiveFactorial(number));
    }

    //TODO Put your method here
    static long calcRecursiveFactorial(int n)
    {
        // Handling base case
        // iIf value of n=1 or n=0, it returns 1
        if (n == 0 || n == 1)
            return 1;
        else if(n < 0)
            return -1;
        // Generic case
        // Otherwise we do n*(n-1)!
        return n * calcRecursiveFactorial(n - 1);
    }
}
