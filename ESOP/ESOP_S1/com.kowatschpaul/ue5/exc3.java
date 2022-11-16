package com.kowatschpaul.ue5;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println("Result of (" + input + " + 10) * 2 is " +
                addTenAndMultiplyByTwo(input));
    }

    /**
     * param: int i
     * return: doubled i
     * */
    static int multiplyByTwo(int i){
        return i*2;
    }

    /**
     * param: int i
     * return i + 10 times 2
     * */
    static int addTenAndMultiplyByTwo(int i){
        i += 10;
        return multiplyByTwo(i);
    }
    // TODO put your method definitions he
}
