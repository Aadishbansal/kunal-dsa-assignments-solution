package com.preparation.dsa.assignment.questions;

public class ThekthFactorofn1492 {
    private static int temp(int n,int k){
        int ans=0;
        int j=0;
        for(int i=1;i<=n;i++){
            if(k==j){
                break;
            }
            if(n%i==0){
                ans=i;
                j++;
            }
        }
        System.out.println(k);
        System.out.println(n);
        System.out.println(j);
        if(k==j){
            return ans;
        }
        return -1;
    }

    public static void main(String[] args) {
                System.out.println(   temp(12,3));

    }
}
