package com.practice.striverAtoZ;

public class Patterns {



    public static void main(String[] args) {
        /**
         Pattern 1
         *
         **
         ***
         ****
         *****
         */
        System.out.println("Pattern 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /**
         Pattern 2
         *
         **
         ***
         ****
         *****
         */
        System.out.println("Pattern 2");
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /**
         Pattern 3
         1
         12
         123
         1234
         12345
         */
        System.out.println("Pattern 3");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        /**
         Pattern 4
         1
         22
         333
         4444
         55555
         */
        System.out.println("Pattern 4");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        /**
         Pattern 5
         *****
         ****
         ***
         **
         *
         */
        System.out.println("Pattern 5");

        for (int i = 5; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /**
         Pattern 6
         12345
         1234
         123
         12
         1
         */
        System.out.println("Pattern 6");

        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

             /**
              Pattern 7
                    *
                  * * *
                 * * * *
                * * * * * *
               * * * * * * *
         */
        System.out.println("Pattern 7");
        int n = 5; // number of rows

        for(int i = 1; i <= n; i++) {
            // print spaces
            for(int s = i; s < n; s++) {
                System.out.print("  ");
            }
            // print stars
            for(int j = 1; j <= (2*i-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }






    }
}
