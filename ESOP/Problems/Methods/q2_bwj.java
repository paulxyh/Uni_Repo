package Methods;

import java.util.Scanner;

/*
* Write a method named isEven that accepts an int argument.
* The method should return true if the argument is even, or false otherwise.
* Also write a program to test your method. */

public class q2_bwj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein!");
        int tested = in.nextInt();

        if(isEven(tested))
            System.out.println(tested + " ist eine gerade Zahl");
        else
            System.out.println(tested +  " ist keine gerade Zahl");
    }

    public static boolean isEven(int i){
        boolean even = i % 2 == 0;

        return even;
    }
}
