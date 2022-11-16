package com.kowatschpaul.ue5;

public class exc4 {
    public static void main(String[] args) {
        char[] array ={'R', 'E', 'I', 'T', 'T', 'I', 'E', 'R' };
        System.out.println("The character string is "
                +(isPalindrome(array) ? "a" : "not a") + " palindrome.");
    }

    static boolean isPalindrome(char[] array) {
        //TODO Put your code here
        boolean bool = false;
        if(array.length > 0) {
            bool = true;
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - i - 1]) {
                    bool = false;
                    break;
                }
            }
        }
        return bool;
    }
}
