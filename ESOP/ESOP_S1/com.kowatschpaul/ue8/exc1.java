package com.kowatschpaul.ue8;
import java.util.Scanner;
public class exc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(joinStrings(input));
    }
    // TODO define your method here
    public static String joinStrings(String in){
        StringBuilder reverse = new StringBuilder();
        StringBuilder swapped = new StringBuilder();
        reverse.append(" ");
        swapped.append(" ");
        for(int i = 0; i < in.length(); i++){
            reverse.append(in.charAt(in.length()-1-i));
            if(in.charAt(i) >= 'a' && in.charAt(i) <= 'z')
                swapped.append((char)(in.charAt(i)-32));
            else if(in.charAt(i) >= 'A' && in.charAt(i) <= 'Z')
                swapped.append((char)(in.charAt(i) + 32));
            else
                swapped.append(in.charAt(i));
        }
        return String.join(",", in, reverse.toString(), swapped.toString());
    }
}
