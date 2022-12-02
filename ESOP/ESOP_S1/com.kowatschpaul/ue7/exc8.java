package com.kowatschpaul.ue7;

import java.util.Scanner;

public class exc8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            String str = in.nextLine();
            printStringClassification(str);
        }
    }

    // TODO define your method here
    private static void printStringClassification(String str){
        if(str.matches("[a-zA-Z]*"))
            System.out.println("Die Eingabe ist ein Wort");
        else if(str.matches("[a-zA-Z\sa-zA-Z]*"))
            System.out.println("Die Eingabe besteht aus mehreren Woertern");
        else if(str.matches("[0-9]*\\.[0-9][0-9]*")||str.matches("[0-9]*"))
            System.out.println("Die Eingabe ist eine Zahl");
        else
            System.out.println("Die Eingabe konnte nicht klassifiziert werden");
    }
}
