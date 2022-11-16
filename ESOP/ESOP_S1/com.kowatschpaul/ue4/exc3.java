package com.kowatschpaul.ue4;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        short[] numbers;

        numbers = new short[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextShort();
            if(numbers[i] == 0)
                break;
        }
        int lookUpNr = in.nextInt();
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == lookUpNr){
                count += 1;
            }
        }
        System.out.println("Die Zahl " + lookUpNr + " kommt " + count + "-mal vor.");
    }
}
