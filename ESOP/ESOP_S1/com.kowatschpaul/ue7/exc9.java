package com.kowatschpaul.ue7;

import java.util.Scanner;

public class exc9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(convertToMorseCode(input));
    }

    /**
     * This method encodes a given text in international morse code. (https://en.wikipedia.org/wiki/Morse_code)
     *
     * @param input Input String as plain text
     * @return String encoded as morse code
     */
    static String convertToMorseCode(String input) {
        // TODO - Insert your code here
        char[] arr = input.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ' '){
                sb.append("    ");
            }
            else{
                sb.append(charToMorseSymbol(arr[i])).append("   ");
            }
        }
        return sb.toString();
    }

    /**
     * This method converts a single character to its morse code representation. If no morse code for the character
     * exists, an empty string is returned.
     *
     * @param ch Input character to encode
     * @return Morse code representation of the given character
     */
    static String charToMorseSymbol(char ch) {
        // TODO - Insert your code here
        switch(ch) {
            case 'a': return ".-";
            case 'b': return "-...";
            case 'c': return "-.-.";
            case 'd': return "-..";
            case 'e': return ".";
            case 'f': return "..-.";
            case 'g': return "--.";
            case 'h': return "....";
            case 'i': return "..";
            case 'j': return ".---";
            case 'k': return "-.-";
            case 'l': return ".-..";
            case 'm': return "--";
            case 'n': return "-.";
            case 'o': return "---";
            case 'p': return ".--.";
            case 'q': return "--.";
            case 'r': return ".-.";
            case 's': return "...";
            case 't': return "-";
            case 'u': return "..-";
            case 'v': return "...-";
            case 'w': return ".--";
            case 'x': return ".--";
            case 'y': return "-.--";
            case 'z': return "--..";
            case '1': return ".----";
            case '2': return "..---";
            case '3': return "...--";
            case '4': return "....-";
            case '5': return ".....";
            case '6': return "-....";
            case '7': return "--...";
            case '8': return "---..";
            case '9': return "----.";
            case '0': return "-----";
            default: return "";
        }
    }
}
