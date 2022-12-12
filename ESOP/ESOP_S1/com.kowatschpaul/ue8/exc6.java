package com.kowatschpaul.ue8;

import java.util.Scanner;

public class exc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(word + " is " + (isPalindrome(word.toLowerCase()) ? "" : "not ") + "a palindrome");
    }
    //Your method will be put here
    public static boolean isPalindrome(String word){
            if(word.length() < 2) { return true;  }
            char first  = word.charAt(0);
            char last   = word.charAt(word.length()-1);
            if(  first != last  ) { return false; }
            else { return isPalindrome(word.substring(1,word.length()-1));
        }
    }
}
