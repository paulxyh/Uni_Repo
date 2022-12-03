package at.hansgriesser.UE7;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println(insertComma(sentence));

        scanner.close();
    }

    static String insertComma(String sentence) {

        String[] words = sentence.split("\\s+");

        StringBuilder sb = new StringBuilder();

        sb.append(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!words[i - 1].contains(",")
                    && (words[i].contains("dass") && !words[i].contains("dasselbe") || words[i].contains("ob"))) {
                sb.append(", " + words[i]);
            } else {
                sb.append(" " + words[i]);
            }

        }

        return sb.toString();
    }
}
