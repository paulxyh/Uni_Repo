package com.kowatschpaul.ue7;

import java.util.Scanner;

public class exc6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Your code will be put here
        StringBuilder builder = new StringBuilder();
        for(int i = n; i >= 0; i--){
            builder.append(i).append(", ");
        }
        for(int i = 1; i <= n; i++){
            if(i == n){
                builder.append(i);
            }
            else
                builder.append(i).append(", ");
        }
        System.out.println(builder.toString());
    }
}
