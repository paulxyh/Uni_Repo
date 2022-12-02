package com.kowatschpaul.ue7;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input != null && input.length()!=0){
            // TODO put your code here
            input = input.trim();
            System.out.println(input);
            System.out.println(input.length());
            System.out.println(input.substring(input.length()-1));
            System.out.println(input.indexOf('!'));
            System.out.println(input.lastIndexOf(','));
            System.out.println(
                    ((input.startsWith("Was ") ||
                            input.startsWith("Wie ") ||
                            input.startsWith("Wer ") ||
                            input.startsWith("Warum "))&&
                            input.endsWith("?")
                            ? "Frage" : "Keine Frage"));
        }else{
            System.out.println("FEHLER: falsche Eingabe!");
        }
    }
}
