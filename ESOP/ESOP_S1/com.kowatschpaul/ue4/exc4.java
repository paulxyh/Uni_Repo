package com.kowatschpaul.ue4;

public class exc4 {
    public static void main(String[] args) {
        char[] word = { 'T', 's', 'e', 't', 'i', 'n', 'i', 'm' };
        char tmp = ' ';
        for(int i = 0; i < word.length/2; i++){
            tmp = word[i];
            word[i] = word[(word.length - 1) - i];
            word[(word.length - 1) - i] = tmp;
        }
        if (Character.isLetter(word[0]))
            word[0] = Character.toUpperCase(word[0]);
        if (Character.isLetter(word[word.length -1]))
            word[word.length - 1] = Character.toLowerCase(word[word.length - 1]);

        for(int i = 0; i < word.length; i++){
            System.out.print(word[i]);
        }
    }
}
