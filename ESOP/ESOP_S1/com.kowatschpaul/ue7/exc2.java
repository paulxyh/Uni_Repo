package com.kowatschpaul.ue7;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Total number of words = " + countWords(text));
    }
    //Your method will be put here
    public static int countWords(String line){
        int result = 0;
        if(line.isEmpty())
            return result;
        String[] words = line.split(" ");
        result = words.length;
        return result;
    }
}
