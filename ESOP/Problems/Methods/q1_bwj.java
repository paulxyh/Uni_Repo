package Methods;

/*
* Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
* Call this method from main( ) and print the results.
* */

import java.util.Scanner;

public class q1_bwj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein:");
        int nr1 = in.nextInt();
        System.out.println("Geben Sie die zweite Zahl ein:");
        int nr2 = in.nextInt();
        System.out.println("Das Ergebnis ist:");
        System.out.println(getTotal(nr1, nr2));
    }

    public static int getTotal(int a, int b){
        return a+b;
    }
}
