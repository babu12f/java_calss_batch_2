package com.javaLecture;

import java.util.*;

public class Class3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathMarks;

        //System.out.println("Enter a Marks in Math: ");
       // mathMarks = sc.nextInt();

        /*if (mathMarks == 25) {
            System.out.println("Your Entered Number is: " + mathMarks);
        }*/

        /*if (mathMarks >= 25) {
            System.out.println("Your are eligible");
        }
        else {
            System.out.println("you are not eligible");
        }*/

        /*if (mathMarks % 2 == 0) {
            System.out.println("It is Even Number");
        }
        else {
            System.out.println("it is Odd Number");
        }*/

        /*
        *
        * mathNumber >= 80 A+
        * mathNumber >= 70 A 70 - 79
        * mathNumber >= 60 A-
        * mathNumber >= 50 B
        *
        * */

        /*if (mathMarks >= 80 && mathMarks <=100) {
            System.out.println("A+");
        }
        else if(mathMarks >= 50 && mathMarks <= 59) {
            System.out.println("B");
        }
        else if(mathMarks >= 70 && mathMarks <= 79) {
            System.out.println("A");
        }
        else if(mathMarks >= 60 && mathMarks < 70) {
            System.out.println("A-");
        }
        else if(mathMarks >= 40) {
            System.out.println("C");
        }
        else if(mathMarks >= 33) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }*/

        /*
        * a e i o u
        * */
       /* char cr = 'a';

        if (cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u') {
            System.out.println("it is a vowel");
        }
        else {
            System.out.println("it is a consonent");
        }*/

       char ch = sc.nextLine().charAt(0);

       switch (ch) {
           case 'a':
               System.out.println("vowel");
               break;
           case 'e':
               System.out.println("vowel");
               break;
           case 'i':
               System.out.println("vowel");
               break;
           case 'o':
               System.out.println("vowel");
               break;
           case 'u':
               System.out.println("vowel");
               break;
           default:
               System.out.println("consonent");
               break;
       }

       int a = sc.nextInt();
       switch (a) {
           case 4:
               System.out.println("four");
               break;
       }

       //loop, for, while, do while, foreah ...


    }
}
