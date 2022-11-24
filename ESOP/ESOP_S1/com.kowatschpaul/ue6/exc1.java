package com.kowatschpaul.ue6;

import java.util.Arrays;

public class exc1 {
    public static void main(String[] args) {
    }
    static int[][] create2DArray(int m, int n){
        int[][] out = new int[0][0];
        int z = 1;
        if(m > 0 && n > 0){
            out = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int k = 0; k < n; k++){
                    out[i][k] = z++;
                }
            }
        }
        return out;
    }
}
