package com.kowatschpaul.ue5;

public class exc9 {
    public static void main(String[] args) {
        double[] input = {1.1, 10.238, 42.96, -138.123};
        System.out.println(calculateAverage(input));
    }
    static double calculateAverage(double[] array) {
        if(array == null || array.length == 0){
            System.out.println("Ungueltig!");
            return 0;
        }
        else{
            double res = 0.0;
            for(int i = 0; i < array.length; i++){
                res += array[i];
            }
            res /= array.length;
            return res;
        }
    }

    double roundNumber(double toRound){
        toRound -= toRound % 0.01;
        toRound *= 100d;
        toRound = ((int)toRound) / 100d;
        return toRound;
    }
}
