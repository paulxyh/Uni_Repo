package com.kowatschpaul.ue4;

public class exc8 {
    public static void main(String[] args) {
        char[] word1 = { 'H', 'e', 'l', 'l', 'o', ',', ' ' };
        char[] word2 = { '!', 'd', 'l', 'r', 'o', 'W' };
        char[] result;

        // TODO Put your code here
        result = new char[word1.length + word2.length];
        for(int i = 0; i < word1.length; i++){
            result[i] = word1[i];
        }
        for(int i = word2.length -1; i >= 0; i--){
            result[word1.length-1 + (word2.length -i)] = word2[i];
        }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }
}
