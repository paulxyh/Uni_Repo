package at.hansgriesser.UE7;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input.substring(0, 1));
        System.out.println(input.substring(input.length() - 2, input.length() - 1));
        System.out.println(input.endsWith("?") ? "is a question" : "is not a question");
        System.out.println(input.contains("i") ? input.split("i")[0].length() : "-1");

        scanner.close();
    }
}
