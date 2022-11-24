package com.kowatschpaul.ue6;

public class exc3 {
    public static void main(String[] args){
        int[][] array = {{1,2,3,4,5},{7,9,17}};
        int num = 7;
        boolean hasElement = search(array, num);
        System.out.println(hasElement);
    }
    // TODO Put your method definition here

    public static boolean search(int[][] arr, int n){
        boolean bool = false;
        if(arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr[i].length; k++) {
                    if (arr[i][k] == n) {
                        bool = true;
                        break;
                    }
                }
            }
        }

        return bool;
    }

}
