package com.kowatschpaul.ue4;

public class exc7 {
    public static void main(String[] args) {
        long n = 4;
        long[] numbers = { 1, 2, 3, 4, 5, 4, 4, 6, 4, 7, 8 };
        long[] result;
        // TODO Put your code here

        short count_n = 0;
        short i = 0;
        while(i < numbers.length){
            if(numbers[i] == n){
                count_n++;
            }
            i++;
        }

        result = new long[numbers.length - count_n];
        int res_i = 0;
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] != n){
                result[res_i] = numbers[x];
                res_i++;
            }
        }
        i = 0;
        while(i < result.length){
            if(i == result.length - 1)
                System.out.print(result[i]);
            else
                System.out.print(result[i] + ",");

            i++;
        }
    }
}
