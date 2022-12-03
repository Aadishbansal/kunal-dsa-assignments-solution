package com.preparation.dsa.assignment;

 class ConditionalsLoops03 {
    private static  void first(){
        int num=90;
        for (int i = 1; i <=90 ; i++) {
            if(num%i==0){
                System.out.println(i);

            }
        }

    }

    private static int second(int n) {
        if(n<=1){
            return 0;
        }
        int[] arr=calculate(n);
        return arr[0]-arr[1];
    }
    private static int[] calculate(int n){
        int prod=1;
        int ele;
        int s=0;
        while(n>0){
            ele=n%10;
            n/=10;
            prod*=ele;
            s+=ele;
        }
        return new int[]{prod,s};
    }
    private static void third(){
        int n=4;
        int p=1;
        while(n>0){
            p*=n;
            n--;

        }
        System.out.println(p);
    }
    private static  void fourth(){
        double v1=200;
        double r=10;
        double t=2;
//        double v2=v1*Math.pow((1-(r/100)),t);
        double v2 = (double) (v1 * Math.pow((1 - r / 100), t));
        System.out.println(v2);

    }
    private static  void fifth() {
    int r=10000;
    int m=250;
    int no=50;
        System.out.println(r/(m-no));
    }
    private static  void sixth() {
        int n=15;
        int r=3;
        long ncr=ncr(n,r);
        long npr=npr(n,r);
        System.out.println(ncr);
        System.out.println(npr);
}

    private static long npr(int n, int r) {
        long ans=factorial(n)/factorial(n-r);
    return  ans;
    }

    private static long ncr(int n, int r) {
        long temp1=factorial(n);
        long temp2=factorial(r);
        long temp3=factorial(n-r);
    long ans=temp1/(temp2*temp3);
    return ans;
    }
    private static long factorial(int n) {
        long ans = 1;
        while (n > 0) {
            ans *= n;
            n--;
        }
        return  ans;
    }
    private static void seventh() {
        System.out.println("leetcode 344");
    }
    private static void eight() {
    String  value="This is a really simple sentence";
//    String  value=" is ";
    String str=value.toLowerCase();
    int vowel=0;
    int consonant=0;

    for (int i = 0; i < str.length(); i++) {
//        if(){
//            System.out.println("Not a character");
//        }
         if (isVowel(str.charAt(i))){
            vowel++;
        }else if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
            consonant++;
        }

    }
        System.out.println(vowel+" "+ consonant);
    }

    private static boolean isVowel(char c) {
//        System.out.println(c);
        switch (c){
            case 'a'-> {
            return  true;
            }
            case 'e'-> {
            return  true;
            }
            case 'i'-> {
            return  true;
            }
            case 'o'-> {
            return  true;
            }
            case 'u'-> {
            return  true;
            }
            default -> {
                return false;
            }


        }
    }
    private static boolean ninth() {
        int num=32132;
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


    private static void tenth() {
    int n=31;
    int c=0;
        for (int i = 1; i <=31 ; i++) {
            if(i%2==0){
                c++;
            }
        }
        System.out.println(c);
    }

    private static void eleventh() {
        int numbers[] = {2, 1, 7, 6, 4, 2, 9,-3,5,-6,-7,4};
        int neg,posEven,posOdd;
        neg=posEven=posOdd=0;
        for (int i :
             numbers) {
                if(i<0) neg+=i;
                else if(i>0) {
                    if(i%2==0) posEven+=i;
                    if(i%2!=0) posOdd+=i;
                }
        }
        System.out.println(neg+" "+posEven+" "+ posOdd);
    }

    public static void main(String[] args) {
//        first();
//        System.out.println(second(4421));
//        third();
//    fourth();
//    fifth();
//    sixth();
//    seventh();
//    eight();
//    ninth();
//        tenth();
//        System.out.println(-2-3);
//    eleventh();
    }

/*
1- Input a number and print all the factors of that number (use loops).
2- Subtract the Product and Sum of Digits of an Integer
3- Factorial Program In Java
4-Calculate Depreciation of Value
5-Calculate Batting Average
6- Find Ncr & Npr
7- Reverse A String In Java
8- Java Program Vowel Or Consonant
9- Perfect Number In Java
10-Ram is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
11-Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
*
 */

/*
*

Calculate Electricity Bill
Calculate Average Of N Numbers
Calculate Discount Of Product
Calculate Distance Between Two Points
Calculate Commission Percentage
Power In Java
Calculate Batting Average
Calculate CGPA Java Program
Compound Interest Java Program
Calculate Average Marks
Sum Of N Numbers
Armstrong Number In Java


Find if a number is palindrome or not
Future Investment Value
HCF Of Two Numbers Program
LCM Of Two Numbers


Check Leap Year Or Not
Sum Of A Digits Of Number
*/

/*
* Area Of Circle Java Program
Area Of Triangle
Area Of Rectangle Program
Area Of Isosceles Triangle
Area Of Parallelogram
Area Of Rhombus
Area Of Equilateral Triangle
Perimeter Of Circle
Perimeter Of Equilateral Triangle
Perimeter Of Parallelogram
Perimeter Of Rectangle
Perimeter Of Square
Perimeter Of Rhombus
Volume Of Cone Java Program
Volume Of Prism
Volume Of Cylinder
Volume Of Sphere
Volume Of Pyramid
Curved Surface Area Of Cylinder
Total Surface Area Of Cube
Fibonacci Series In Java Programs

Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
Take integer inputs till the user enters 0 and print the largest number from all.
Addition Of Two Numbers*/

}