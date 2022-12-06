package at.hansgriesser.UE7;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            String str = in.nextLine();
            printStringClassification(str);
        }

        in.close();
    }

    static void printStringClassification(String input) {
        if (input.matches("^[a-zA-Z]+$")) {
            System.out.println("Die Eingabe ist ein Wort");
        } else if (input.matches("\\w+ .*")) {
            System.out.println("Die Eingabe besteht aus mehreren Woertern");
        } else if (input.matches("^[0-9]*$|[0-9]+\\.[0-9]+")) {
            System.out.println("Die Eingabe ist eine Zahl");
        } else {
            System.out.println("Die Eingabe konnte nicht klassifiziert werden");
        }
    }
}