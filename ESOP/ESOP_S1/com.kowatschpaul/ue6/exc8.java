package com.kowatschpaul.ue6;

import java.util.Arrays;

public class exc8{
        public static void main(String[] args) {
            int[][] array2d = new int[][]{{1, 2},{},{3}};

            // TODO Put your method call and output here
            System.out.println(Arrays.toString(findMinMax(array2d)));
        }

        // TODO Put your method definition here
        static int[] findMinMax(int[][] array){
            int[] res = new int[0];
            if(array != null && array.length > 0){

                res = new int[array.length];
                int tmp = 0;
                for(int i = 0; i < array.length; i++){
                    if(array[i] == null || array[i].length == 0){
                        res = new int[0];
                        break;
                    }
                    else if(i % 2 == 0 || i == 0){
                        for(int k = 0; k < array[i].length; k++){
                            if(k == 0){
                                tmp = array[i][k];
                            }
                            if(tmp > array[i][k]){
                                tmp = array[i][k];
                            }
                        }
                        res[i] = tmp;
                    }
                    else{
                        for(int k = 0; k < array[i].length; k++){
                            if(k == 0){
                                tmp = array[i][k];
                            }
                            if(tmp < array[i][k]){
                                tmp = array[i][k];
                            }
                        }
                        res[i] = tmp;
                    }
                }
            }
            return res;
        }
}
