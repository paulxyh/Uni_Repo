package com.kowatschpaul.ue8;

public class exc2 {
    public static void main(String[] args) {
        String[] words = null;
        System.out.println(getLongestString(words));
    }

    public static String getLongestString(String[] words) {
        String result = "";
        if (words == null || words.length == 0)
            return result;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > result.length())
                result = words[i];
        }
        return result;
    }
}
