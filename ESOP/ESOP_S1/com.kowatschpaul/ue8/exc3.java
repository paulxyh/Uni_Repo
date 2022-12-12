package com.kowatschpaul.ue8;

public class exc3 {
    public static void main(String[] args) {
        iterativeMethod(5);
        recursiveMethod(5);
    }
    static void iterativeMethod(int n) {
        for (int i=n; i>=0; i-=2) {
            System.out.print(i);
        }
    }
    static void recursiveMethod(int n){
        if(n >= 0) {
            System.out.print(n);
            recursiveMethod(n - 2);
        }
    }
}
