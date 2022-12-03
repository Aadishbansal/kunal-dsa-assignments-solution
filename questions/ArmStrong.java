package com.preparation.dsa.assignment.questions;

public class ArmStrong {
    private static void ninth(){
        int num1=1;
        int num2=200000000;
        int min=num1>num2?num2:num1;
        for (int i = min; i <=num1 || i<=num2 ; i++) {
            if(                checkArmStrong(i)){
                System.out.println(i);
            }

        }
    }

    private static boolean checkArmStrong(int num) {
        int check=num;
        int temp=0;
        int digits=checkDigits(num);
        while(num>0){

            temp+=multiple((num%10),digits);
            num/=10;

        }
        return temp==check;
    }
    private static int multiple(int num,int digits){
        int temp=num;
        while(digits>1){
            num=temp*num;
            digits--;
        }
        return num;
    }
    private static int checkDigits(int num){
        int i=0;
        while(num>0){
            num=num/10;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
    ninth();
    }
}
