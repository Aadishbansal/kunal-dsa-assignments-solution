package com.preparation.dsa.assignment.questions;

import java.util.Scanner;

public class EvenOdd {
    private static void first(){
        Scanner in=new Scanner(System.in);
        int num;
        while(true){
            num=in.nextInt();
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }

    public static void main(String[] args) {
        first();
    }
}
