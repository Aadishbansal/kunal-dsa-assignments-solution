package com.preparation.dsa.assignment.questions;

public class ReverseNumber7 {
    public static int reverse(int x) {
    int temp=x<0?-cal(-x):cal(x);
    return temp>=Math.pow(2,31)*-1&&temp<=Math.pow(2,31)?temp:0;
//    if(x<0){
//        return -cal(-x);
//    }
//        return cal(x);
}
    private static int cal(int x){
        int ans=0;
        while(x>0){
            ans=(x%10)+(ans*10);
            x/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        String s="Let's take LeetCode contest";
        String ans="";
        for(int i=(s.length()-1);i>=0;i--){
            ans+=s.charAt(i);

        }
        System.out.println(ans);
    }
}
