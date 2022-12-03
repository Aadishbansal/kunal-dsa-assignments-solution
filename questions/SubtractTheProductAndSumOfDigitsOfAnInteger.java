package com.preparation.dsa.assignment.questions;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    private static int subtractProductAndSum(int n) {

        int p=1;
        int s=0;
        while(n>0){
            p*=n%10;
            s+=n%10;
            n/=10;

        }
        return p-s;
    }

    public static void main(String[] args) {
        System.out.println(   subtractProductAndSum(0));
    }
}