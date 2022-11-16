package com.kowatschpaul.ue4;

public class exc5 {
    public static void main(String[] args) {
        boolean[] array1 = { true, true, true };
        boolean[] array2 = { false, false, true };
        // TODO Put your code here
        if(array1.length != array2.length){
            System.out.println("Die Arrays sind nicht gleich lang.");
        }
        else {
            short hamDist = 0;
            for(int i = 0; i < array1.length; i++){
                if(array1[i] != array2[i]){
                    hamDist++;
                }
            }
            System.out.println("Die Hamming-Distanz ist " + hamDist + "!");
        }
    }
}
