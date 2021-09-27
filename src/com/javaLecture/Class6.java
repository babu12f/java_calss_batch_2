package com.javaLecture;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        /*int[] myArray = new int[5];
        myArray[0] = 113;
        myArray[1] = 3;
        myArray[2] = 43;
        myArray[3] = 89;
        myArray[4] = 90;*/

        /*System.out.println(myArray[2]);
        int sum = myArray[0] + myArray[1];

        System.out.println(sum);*/
        //6, 7, 8, 9, 10

        /*int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //data[5] = 300;
        int datSize = data.length;
        //System.out.println(datSize);
        *//*
        * find the sum of all element of the array
        *
        * find the average of the array
        * *//*

        int result = 0;
        *//*result = result + data[0];
        result = result + data[1];
        result = result + data[2];
        result = result + data[3];
        result = result + data[4];*//*
        for (int a = 0; a < datSize; a = a + 1) {
            result = result + data[a];
        }
        System.out.println("sum of the array : " + result);
        double avg = (double) result / datSize;
        System.out.println("average of the array : " + avg);*/
        /*
        * task - 1
        *
        * given and array: print all odd Number
        * */

        /*int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            myArray[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(myArray[i]);
        }*/
        /*int[] a = new int[3];
        char[] cArray = new char[5];*/
        int[][] my2dArray = new int[5][4];
        my2dArray[0][0] = 78;
        my2dArray[0][3] = 80;


    }
}
