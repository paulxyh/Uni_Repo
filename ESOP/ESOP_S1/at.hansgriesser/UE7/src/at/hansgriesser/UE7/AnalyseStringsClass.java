package at.hansgriesser.UE7;

import java.util.Scanner;

public class AnalyseStringsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input != null && input.length() != 0) {
            input = input.trim();
            System.out.println(input);

            System.out.println(input.length());

            System.out.println(input.charAt(input.length() - 1)); // Stelle des letzten Zeichens

            System.out.println(input.indexOf('!'));

            System.out.println(input.lastIndexOf(','));

            if ((input.startsWith("Was ") || input.startsWith("Wie ") || input.startsWith("Wer ")
                    || input.startsWith("Warum ")) && input.endsWith("?")) {
                System.out.println("Frage");
            } else {
                System.out.println("Keine Frage");
            }

        } else {
            System.out.println("FEHLER: falsche Eingabe!");
        }

        sc.close();
    }
}
