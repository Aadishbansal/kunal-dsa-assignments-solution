package com.preparation.dsa.assignment.questions;

public class Palindrome {
    private static void eighth(){
        String str1="dsd16461dd";
        String compareTo="";
        for (int i = str1.length()-1; i >=0 ; i--) {
            compareTo+=str1.charAt(i);
        }
        boolean ans=str1.equals(compareTo);
            System.out.println(ans);
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

    public static void main(String[] args) {
        eighth();
    }
}
