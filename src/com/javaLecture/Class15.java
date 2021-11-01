package com.javaLecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class15 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student s1 = new Student(1, "ruhit dhaka");
        Student s2 = new Student(4, "khalid");
        Student s3 = new Student(2, "abrar");
        Student s4 = new Student(3, "jav class");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


        Collections.sort(studentList, new studentRollComparator());

       /* Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (s2.getRoll() == s1.getRoll()) {
                    return 0;
                }
                else if (s1.getRoll() < s2.getRoll()) {
                    return 1;
                }
                return -1;
            }
        });*/

        for (Student s: studentList) {
            System.out.println(s);
        }

    }
}

class studentRollComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s2.getRoll() == s1.getRoll()) {
            return 0;
        }
        else if (s1.getRoll() > s2.getRoll()) {
            return 1;
        }
        return -1;
    }
}

class studentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getName().length() == s2.getName().length()) {
            return 0;
        } else if (s1.getName().length() > s2.getName().length()) {
            return 1;
        }

        return -1;
    }
}

class Student {
    private int roll;
    private String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}