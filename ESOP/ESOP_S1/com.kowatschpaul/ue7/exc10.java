package com.kowatschpaul.ue7;

import java.util.Arrays;
import java.util.Scanner;

public class exc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase();
        int key = sc.nextInt();

        // TODO adapt code
        if(!(checkInput(input) && checkKey(key))){
            System.out.println("Input is not correct.");
        }else {

            String encoded = encode(input, key);
            String decoded = decode(encoded, key);
            System.out.println("input: " + input);
            System.out.println("key: " + key);
            System.out.println("encoded: " + encoded);
            System.out.println("decoded: " + decoded);
        }

    }

    // TODO implement your methods here
    /**
     * Checks if the input contains only a word in CAPS
     * @param input the given input
     * @return true if input matches pattern*/
    private static Boolean checkInput(String input){
       return input.matches("[A-Z]*");
    }
    /**
     * Checks if the key lies between 0 and 25
     * @param key the specified key
     * @return true if key matches pattern*/
    private static Boolean checkKey(int key){
        return key >= 0 && key <= 25;
    }
    /**
     * Encodes the input message with a specified key by using the caesar chiffre
     * @param in contains the message which should be encoded
     * @param key contains the chiffre key
     * @return the encoded message*/
    private static String encode(String in, int key){
        char[] transform = in.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        char tmpCh = ' ';
        for(int i = 0; i < transform.length; i++){
            tmpCh = transform[i];
            tmpCh += key;
            tmp.append(tmpCh);

            if(!tmp.toString().matches("[A-Z]")){
                int tmpKey = (key - (90 - transform[i]));
                transform[i] = (char)(64 + tmpKey);
            }else {
                transform[i] += key;
            }
            sb.append(transform[i]);
            tmp.deleteCharAt(0);
        }
        return sb.toString();
    }
    /**
     * Decodes an encoded message with a specified key by using the caesar chiffre
     * @param msgEncoded contains the message which should be decoded
     * @param key contains the chiffre key
     * @return the decoded message*/
    private static String decode(String msgEncoded, int key){
        char[] transform = msgEncoded.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        char tmpCh = ' ';
        for(int i = 0; i < transform.length; i++){
            tmpCh = transform[i];
            tmpCh -= key;
            tmp.append(tmpCh);

            if(!tmp.toString().matches("[A-Z]")){
                int tmpKey = key-(transform[i] - 65);
                transform[i] = (char)(91 - tmpKey);
            }else {
                transform[i] -= key;
            }
            sb.append(transform[i]);
            tmp.deleteCharAt(0);
        }
        return sb.toString();
    }
}
