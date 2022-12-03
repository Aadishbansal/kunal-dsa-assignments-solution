package com.preparation.dsa.assignment;



 class Function04 {
    private static void firstForNumber() {
       int n1=6;
       int n2=8;
       int n3=9;
       int sumOfTwo= (int) (Math.pow(n1,2)+Math.pow(n2,2));
       int sumThird=(int)Math.pow(n3,2);
       System.out.println(sumOfTwo==sumThird);

    }

    private static void firstForArray() {
//       int[] arr= {3, 1, 4, 6, 5};
 //       int[] arr= {10, 4, 6, 12, 5};
       int[] arr= {3, 2, 4, 6, 5};
       boolean flag=false;
       for (int i = 0; i <arr.length; i++) {
          for (int j = i+1; j < arr.length ; j++) {
             for (int k = j+1; k < arr.length ; k++) {
//                System.out.println(i+" "+j+" "+k);
                if (isTriplet(arr[i], arr[j], arr[k])) {
                   System.out.printf("(%d,%d,%d)", arr[i], arr[j], arr[k]);
                   flag=true;
          }
             }
          }
       }
       System.out.println(flag);
    }

    private static boolean isTriplet(int i, int j, int k) {
//       System.out.printf("(%d,%d,%d)",i,j,k);
//       System.out.println();
       int sumOfTwo= (int) (Math.pow(i,2)+Math.pow(j,2));
       int sumThird=(int)Math.pow(k,2);
//       System.out.println(sumOfTwo);
//       System.out.println(sumThird);
//       System.out.println(sumOfTwo==sumThird);
       return sumOfTwo==sumThird;


    }

    public static void main(String[] args) {
//       firstForNumber();
       firstForArray();
    }



 }
/*
1- Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
* */
