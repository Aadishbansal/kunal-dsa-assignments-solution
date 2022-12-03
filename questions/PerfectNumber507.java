package com.preparation.dsa.assignment.questions;

public class PerfectNumber507
{
    private static boolean checkPerfectNumber(int num) {
        if(num<=0){
            return false;
        }
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0 ){
                sum+=i;
            }
        }
        return sum==num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(99999998));
    }
}
