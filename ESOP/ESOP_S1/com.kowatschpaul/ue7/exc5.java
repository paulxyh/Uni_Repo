package com.kowatschpaul.ue7;

import java.util.Scanner;

public class exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println(insertComma(sentence));
    }

    public static String insertComma(String sentence) {


        if(sentence.contains(", dass") || sentence.contains(", ob")) {
            return sentence;
        }
        else{

            sentence = sentence.replaceAll("\\sdass\\s", ", dass ");

            sentence = sentence.replaceAll("\\sob\\s", ", ob ");
        }

        return sentence;
    }
    //TODO define your method here
}
