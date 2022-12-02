package com.kowatschpaul.ue7;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // TODO put your code here
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length()-2));
        System.out.println((input.endsWith("?") ? "is a question" : "is not a question"));
        String sub = input.split("i")[0];
        System.out.println(sub.length());
    }
}
