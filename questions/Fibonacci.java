package com.preparation.dsa.assignment.questions;

import java.util.Arrays;

public class Fibonacci {
    private static void seventh(){

        int n=20;
        if(n<=1){
            System.out.println( n);
        }
        int[] ans=new int[n];
        ans[0]=0;
        ans[1]=1;
        for (int i = 2; i <n ; i++) {
            ans[i]=ans[i-2]+ans[i-1];
        }
        System.out.println(Arrays.toString(ans));
        System.out.println( ans[n-1]+ans[n-2]);;
    }

    public static void main(String[] args) {
        seventh();
    }
}
