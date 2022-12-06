package at.hansgriesser.UE7;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Total number of words = " + countWords(text));

        scanner.close();
    }

    static int countWords(String input) {
        return input.trim().isEmpty() ? 0 : input.trim().split("\\s+").length;
    }
}
