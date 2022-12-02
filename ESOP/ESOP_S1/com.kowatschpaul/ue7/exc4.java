package com.kowatschpaul.ue7;

import java.util.Objects;
import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(removeDuplicateWords(input));
    }

    // TODO define your method here
    public static String removeDuplicateWords(String input){
        String[] result = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.length;i++){
            if(i+1 < result.length){
                if(!result[i].equals(result[i+1])){
                    sb.append(result[i]);
                    sb.append(" ");
                }
            }
            else{
                sb.append(result[i]);
            }
        }
        return sb.toString();
    }
}
