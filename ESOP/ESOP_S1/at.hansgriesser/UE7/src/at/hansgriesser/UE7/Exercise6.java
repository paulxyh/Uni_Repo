package at.hansgriesser.UE7;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder builder = new StringBuilder();

        for (int i = n; i > 0; i--) {
            builder.append(i + ", ");
        }
        builder.append("0,");

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                builder.append(" " + i);
            } else {
                builder.append(" " + i + ",");
            }

        }

        System.out.println(builder.toString());

        in.close();
    }
}
