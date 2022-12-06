package at.hansgriesser.UE7;

import java.util.Scanner;

public class SwapSentencesClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        swapSentences(input);
        in.close();
    }

    static void swapSentences(String input) {
        String[] sentences = input.split("\\.");

        System.out.println(sentences[1].trim() + ". " + sentences[0].trim() + ".");
        System.out.println(sentences[1].trim().toUpperCase() + ". " + sentences[0].trim().toLowerCase() + ".");
        System.out.println(sentences[1].trim() + "! " + sentences[0].trim() + "!");

    }
}