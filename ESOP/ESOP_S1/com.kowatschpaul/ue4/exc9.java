package com.kowatschpaul.ue4;

import java.util.Scanner;

public class exc9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        short[] pos;
        char[] alphabet;

        // TODO Put your code here
        pos = new short[n];
        alphabet = new char[26];
        for(int i = 0; i < n; i++){
            pos[i] = in.nextShort();
        }
        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = (char)(65 + i);
        }
        for(int i = 0; i < n; i++){
            System.out.print(alphabet[pos[i]]);
        }

    }
}
