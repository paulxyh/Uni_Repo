package com.kowatschpaul.ue5;

public class exc6 {
    public static void main(String[] args) {
        boolean[] array1 = null;
        boolean[] array2 = { false, false, true };

        int distance;
        // TODO Call your method here

        distance = getDistance(array1, array2);

        if(distance == -1){
            System.out.println("The arrays do not have the same length!");
        }else{
            System.out.println("The Hamming distance is "+distance);
        }
    }

    static int getDistance(boolean[] arr1, boolean[] arr2){
        if(arr1 == null || arr2 == null || arr1.length != arr2.length )
            return -1;
        else{
            int i = 0;
            for(int y = 0; y < arr1.length; y++){
                if(arr1[y] != arr2[y]){
                    i += 1;
                }
            }
            return i;
        }
    }
}
