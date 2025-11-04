package com.practice.striverAtoZ;

public class Maths {


    static int countDigit(int n){
        int count =0 ;

            while  (n!=0){
               int  remainder = n %10;
                count++;
               n= n /10;

            }

        return count;
    }

    static int reverseNumber(int n){
        int sum =0 ;

        while  (n!=0){
            int  remainder = n %10;
            sum = sum*10 + remainder;
            n= n /10;

        }

        return sum;
    }


    static void isPalindrome(int n){
        int original = n;
        int sum =0 ;

        while  (n!=0){
            int  remainder = n %10;
            sum = sum*10 + remainder;
            n= n /10;

        }

        if(sum==original){
            IO.println("It is palindrome");
        }else {
            IO.println("Not a palindrome");
        }

    }


    static void isArmStrong(int n){
        int original = n;
        int cube = 0;
        int sum = 0;
        while(n!=0){
            int remainder = n % 10;
            cube = (int) Math.pow(remainder,3) ;
            sum += cube;
            n = n/10;
        }

        if(original == sum){
            IO.println("It is Armstrong");
        }
        else{
            IO.println("Not a Armstrong");
        }



    }



    static void main() {

        IO.println("========================");
        IO.println("Count Digit");
        IO.println(countDigit(123));


        IO.println("========================");
        IO.println("Reverse a Number");
        IO.println(reverseNumber(123));

        IO.println("========================");
        IO.println("Is Palindrome");
        isPalindrome(123);

        IO.println("========================");
        IO.println("Is Armstrong");

    }

}
