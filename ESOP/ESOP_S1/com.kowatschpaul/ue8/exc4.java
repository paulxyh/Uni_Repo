package com.kowatschpaul.ue8;

import java.util.Scanner;

public class exc4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String result = reverseString(word);
        System.out.println(result);
    }
    //TODO your method will be put here
    public static String reverseString(String word){
        if(word.isEmpty())
            return word;
        else
            return reverseString(word.substring(1))+word.charAt(0);
    }
}
