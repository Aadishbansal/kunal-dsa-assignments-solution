package com.preparation.dsa.assignment;

import java.util.Arrays;
import java.util.Scanner;

 class Firstjava02 {
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
    private static void third() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter p :");
        int p=in.nextInt();
        System.out.print("Enter t :");
        int t=in.nextInt();
        System.out.print("Enter r :");
        int r=in.nextInt();
        System.out.println((p*r*t)/100);
        }

        private static void seventh(){

            int n=2;
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
        private static void eighth(){
        String str1="dsd16461dsd";
        String compareTo="";
            for (int i = str1.length()-1; i >=0 ; i--) {
                compareTo+=str1.charAt(i);
            }
            boolean ans=str1.equals(compareTo);
//            System.out.println(ans);
            int x=121;
            int temp=0;
            int check=x;
            while(x>0){
                temp=(x%10)+(temp*10);
                x=x/10;

            }
            System.out.println(check==temp);
        }
        private static void leetcode125(){
//            String s = "A man, a plan, a canal: Panama";
            String s = "0P";
            String lower="";
//            for (int i = 0; i <s.length() ; i++)
//            {
                lower+=s.toLowerCase();
//            }
            String removeSpecial="";
            for (int i = 0; i <lower.length() ; i++) {
                if(lower.charAt(i)!=' '){
//                if(lower.charAt(i)>='a'&&lower.charAt(i)<='z'){
                    removeSpecial+=lower.charAt(i);
                }
            }
            String reverse="";
            for (int i = removeSpecial.length()-1; i >=0 ; i--) {
                reverse+=removeSpecial.charAt(i);
            }
            System.out.println(reverse);
            System.out.println(removeSpecial);
            System.out.println(removeSpecial.equals(reverse));
        }

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
//    first();
//        third();
//        seventh();
//            eighth();
//        leetcode125();
        ninth();
        }

}
/**
 1 Write a program to print whether a number is even or odd, also take input from the user.
2  Take name as input and print a greeting message for that particular name.
 3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
 4 Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
 5Take 2 numbers as input and print the largest number.
 6 Input currency in rupees and output in USD.
7 To calculate Fibonacci Series up to n numbers.
8 To find out whether the given String is Palindrome or not.
9 To find Armstrong Number between two given number.
 *
 */























