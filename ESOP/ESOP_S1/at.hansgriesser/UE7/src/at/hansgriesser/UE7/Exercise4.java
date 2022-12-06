package at.hansgriesser.UE7;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(removeDuplicateWords(input));

        in.close();
    }

    static String removeDuplicateWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] words = s.split("\\s+");

        sb.append(words[0] + " ");

        for (int i = 1; i < words.length; i++) {
            if (!words[i].contains(words[i - 1])) {
                sb.append(words[i] + " ");
            }
        }

        return sb.toString();
    }
}