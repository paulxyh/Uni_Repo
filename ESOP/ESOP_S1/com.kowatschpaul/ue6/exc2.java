package com.kowatschpaul.ue6;

public class exc2 {
    public static void main(String[] args) {

        int[][] array = new int[][]{};

        if(isRectangular(array)){
            System.out.println("Matrix");
        }else{
            System.out.println("Two-dimensional array");
        }
    }

    static boolean isRectangular(int[][] arr) {
        boolean bool = true;
        if (arr != null){
            if(arr.length != 0){
                int size = arr[0].length;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length != size) {
                        bool = false;
                        break;
                    }
                }
            }
        }
        else{
            bool = false;
        }
        return bool;
    }
}
