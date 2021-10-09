package com.javaLecture.assignmentCheck;

import java.util.Scanner;

public class Test {
    public static void main(String[] cp) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "";

        for (int i=s1.length()-1; i>=0; i--) {
            s2 += s1.charAt(i);
        }

        System.out.println(s2);
    }

}
