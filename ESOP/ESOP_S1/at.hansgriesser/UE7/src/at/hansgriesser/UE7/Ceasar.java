package at.hansgriesser.UE7;

import java.util.Scanner;

public class Ceasar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase();
        int key = sc.nextInt();

        if (checkInput(input) || checkKey(key)) {
            System.out.println("Input is not correct.");
            System.exit(1);
        }

        String encoded = encode(input, key);
        String decoded = decode(encoded, key);
        System.out.println("input: " + input);
        System.out.println("key: " + key);
        System.out.println("encoded: " + encoded);
        System.out.println("decoded: " + decoded);

    }

    static String encode(String s, int key) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) + key <= 90) {
                sb.append((char) (s.charAt(i) + key));
            } else {
                // 64 + (Buchstabe + Key) - 90
                // sb.append((char) ((64 + (s.charAt(i) + key)) - 90));
                // First Iteratrion => Formel vereinfachen => -26 + char + key:

                sb.append((char) (-26 + s.charAt(i) + key));
            }
        }

        return sb.toString();
    }

    static String decode(String s, int key) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - key >= 65) {
                sb.append((char) (s.charAt(i) - key));
            } else {
                // 91 - (65 - (Buchstabe - Key))
                // sb.append((char) ((91 - (65 - (s.charAt(i) - key)))));
                // First Iteration => Formel vereinfachen => 26 + char - key:

                sb.append((char) (26 + s.charAt(i) - key));
            }
        }

        return sb.toString();
    }

    static boolean checkInput(String input) {
        return !input.matches("^\\b[A-Z]+\\b$");
    }

    static boolean checkKey(int key) {
        boolean valid = key >= 0 && key < 26 ? false : true;
        return valid;

    }

}