package com.javaLecture;

import com.sun.xml.internal.ws.model.wsdl.WSDLOutputImpl;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        /*String comparing*/
        /*String s1 = "ruhit";
        String s2 = "ruhit";

        if (s1.equals(s2)) {
            System.out.println("both are equals");
        }
        else {
            System.out.println("not equals");
        }*/


        /*Break statement in loop*/
        /*for (int i = 1; i<= 1000; i++) {

            System.out.println(i);
            if (i == 50){
                break;
            }

        }*/

        /*Continue in loop*/
        /*for (int i = 1; i <= 5; i++) {

            System.out.println(i);

            if (i == 3){
                continue;
            }

            System.out.println(i);
        }*/

        /*myPrinter("hdfsfsdfsdfsdi");

        int a = 12;
        int b = 13;

        double rs = mySum(a, b);

        System.out.println(rs);*/

        /*
        * write three more methods
        *
        * mySub input( 12.34, 34 ) out (subtraction of those two number)
        * myMulti input( 12.34, 34 ) out (multiplication of those two number)
        * myDivision input( 12.34, 34 ) out (division of those two number)
        *
        * */


        /*Array --> store list of items */

        int[] bangaliNumbers = new int[5];

        bangaliNumbers[0] = 50;
        bangaliNumbers[1] = 56;
        bangaliNumbers[2] = 40;
        bangaliNumbers[3] = 50;
        bangaliNumbers[4] = 98;

        System.out.println(bangaliNumbers[4]);
    }

    public static void myPrinter(String abc) {
        System.out.println(abc);
    }

    public static int mySum(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }
}
