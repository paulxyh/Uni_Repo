package com.kowatschpaul.ue7;

import java.util.Scanner;

public class exc7 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        swapSentences(input);
    }
    // TODO define your method here
    private static void swapSentences(String string){
        String[] result = string.split("\\.");
        StringBuilder sb = new StringBuilder();
        result[1] = result[1].replaceFirst("^\\s", "");
        string = sb.append(result[1]).append(". ").append(result[0]).append(".").toString();
        System.out.println(string);
        sb = new StringBuilder();
        string = sb.append(result[1].toUpperCase()).append(". ").append(result[0].toLowerCase()).append(".").toString();
        System.out.println(string);
        sb = new StringBuilder();
        string = sb.append(result[1]).append(". ").append(result[0]).append(".").toString().replaceAll("\\.", "!");
        System.out.println(string);
    }
}
