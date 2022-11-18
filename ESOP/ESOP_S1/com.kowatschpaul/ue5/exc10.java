package com.kowatschpaul.ue5;

import java.util.Scanner;

public class exc10 {
    public static void main(String[] args) {
        int upperlimit;
        int count = 0;
        Scanner in = new Scanner(System.in);
        upperlimit = in.nextInt();
        for(int i = 1; i <= upperlimit; i++ ){
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            else
                System.out.print("# ");
        }
        System.out.println("\nFound " + count + " prime numbers until " + upperlimit);
    }

    static boolean isPrime(int n){
        boolean tester = true;
        if(n == 0 || n == 1)
            return false;
        else if(n == 2)
            return true;
        else {
            for(int i = 2; i < n; i++){
                if(n % i == 0) {
                    tester = false;
                    break;
                }
            }
            return tester;
        }
    }
}
