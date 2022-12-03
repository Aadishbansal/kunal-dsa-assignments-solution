package com.preparation.dsa.assignment.questions;

public class LeapYear {
    private static boolean first(int year){
        if((year%4==0 &&year%100!=0)||year%400==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        first(2014);
    }
}
