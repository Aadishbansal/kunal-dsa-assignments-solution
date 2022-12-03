package com.preparation.dsa.assignment.questions;

public class FactorsOfNumber {
    private static  void first(){
        int num=90;
        for (int i = 1; i <=90 ; i++) {
            if(num%i==0){
                System.out.println(i);

            }
        }

    }

    public static void main(String[] args) {
        first();
    }
}
