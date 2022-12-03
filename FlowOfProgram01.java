package com.preparation.dsa.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

 class FlowOfProgram01 {
    private static boolean first(int year){
      if((year%4==0 &&year%100!=0)||year%400==0){
          return true;
      }
        return false;
    }
    private static void third(int num){
        for (int i = 1; i <11 ; i++) {
            System.out.println(num*i);
        }
    }
    private static int[] lcm(int num1,int num2){
        int[] ans=new int[2];
        int lcm=0;
        lcm=(num1*num2)/gcdOfTwoNmber(num1, num2);
        ans[0]=lcm;


        //        while(num1!=0){
//            for (int i = 1; i <=num1 ; i++) {
//                if(num1/i==0){
//                    temp.add(i);
//                }
//            }
//  r      }
    return ans;
    }
    private static int gcdOfTwoNmber(int num1,int num2){
        int ans=0;
        int max=num1;
        if(num1<num2){
            max=num2;
        }
        for (int i = 1; i <=max ; i++) {
            if(num1%i==0&&num2%i==0){
                ans=i;
            }
        }
        return ans;
    }
    private static List<Integer> tempHcf(int num1, int num2){
        List<Integer> factor1=factors(num1);
        List<Integer> factor2=factors(num2);
        System.out.println(factor1);
        System.out.println(factor2);
        int max= Math.max(factor1.  size(), factor2.size());
        List<Integer> temp=new ArrayList<>();
        if(factor1.size()==max){
           int i, j;
           i=j=0;
            while(i<max) {
                j = 0;

                while (j < factor2.size()) {
                    if (factor1.get(i) == factor2.get(j)) {
                        temp.add(factor1.get(i));
                        factor2.remove(j);
                        i++;
                    }
                    j++;
                }
                i++;
            }
        } else if (factor2.size()==max) {
            int i, j;
            i=j=0;
//            System.out.println(i+" "+j);
            while(i<max){
                j=0;
                while(j<factor1.size()){
                    if(factor2.get(i)==factor1.get(j)){
                        temp.add(factor2.get(i));
                        factor1.remove(j);
                        i++;
                    }
                    j++;
                }
                i++;
            }
        }
        return temp;
    }
    private static List<Integer> factors(int num){
    List<Integer> ans=new ArrayList<>();
    while(num>0) {
        for (int i=2;i<=num;i++){
            if(num%i==0){
                ans.add(i);
                num=num/i;
            }
            if(num==1){
                ans.add(num);
                return ans;
            }
        }
    }
    return ans;
    }
    private static int hcf(int num1,int num2){
        int ans=0;
        for (int i = 1; i <=num1||i<=num2 ; i++) {
            if(num1%i==0 &&num2%i==0){
                ans=i;
            }
            }
        return ans;
    }
    private  static void fifth(){
        Scanner in=new Scanner(System.in);
        List<Integer> ansArray=new ArrayList<>();
        int element;
        while(true){
                String temp=in.next();
                if(temp.equals("x")){
                    break;
                }
                else{
                    try {
                        element=Integer.parseInt(temp);
                        ansArray.add(element);
                    }catch (NumberFormatException e){
                    }
                }
            }
        System.out.println(ansArray);
    int ans=0;
        for (int item:
             ansArray) {
            ans+=item;
        }
        System.out.println(ans);
    }






    public static void main(String[] args) {
//        System.out.println(first(2012));
//        third(9);
//        System.out.println(Arrays.toString(lcm(45,78)));
//        System.out.println(hcf(18,24));
//

//        System.out.println(gcdOfTwoNmber(18,24));
fifth();

    }
}
/*
*
 1- Input a year and find whether it is a leap year or not.
2- Take two numbers and print the sum of both.
3- Take a number as input and print the multiplication table for it.
4-Take 2 numbers as inputs and find their HCF and LCM.
5- Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
*
* */

























