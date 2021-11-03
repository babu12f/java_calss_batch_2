package com.javaLecture;

import java.util.*;

public class Class15Rep {

    public static void main(String[] args) {

        //Set<Integer> mySet = new HashSet<>();
        //Set<Integer> mySet = new LinkedHashSet<>();
        /*Set<Integer> mySet = new TreeSet<>();

        mySet.add(300);
        mySet.add(1);
        mySet.add(-1);
        mySet.add(1);
        mySet.add(20);

        for (int v: mySet) {
            System.out.println(v);
        }

        System.out.println(mySet.contains(4));*/


        /*Set<String> mySet = new TreeSet<>();

        mySet.add("d");
        mySet.add("c");
        mySet.add("b");
        mySet.add("b");
        mySet.add("a");

        for (String v: mySet) {
            System.out.println(v);
        }*/

        /*Queue<String> myQ = new LinkedList<>();

        myQ.add("ruhit");
        myQ.add("khalid");
        myQ.add("abrar");

        System.out.println(myQ);*/

        //String top = myQ.peek();
        //System.out.println(top);

        //System.out.println(myQ);

        /*while (!myQ.isEmpty()) {
            String d = myQ.poll();
            System.out.println(d);
        }
        System.out.println(myQ);*/

        List<Student> stdList = new ArrayList<>();

        Student s3 = new Student(3, "abrr");
        Student s1 = new Student(1, "khalid");
        Student s2 = new Student(4, "ruhit");

        stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);

        Comparator<Student> mct = new stdRollComparatorName();

        Collections.sort(stdList, mct);

        for (Student s: stdList) {
            System.out.println(s);
        }

        /*Vector<Integer> myList = new Vector<>();

        myList.add(100);
        myList.add(59);
        myList.add(4);
        myList.add(30);
        myList.add(100);

        Collections.sort(myList);*/

    }

}


class stdRollComparatorName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().length() == o2.getName().length()) {
            return 0;
        }
        else if (o1.getName().length() < o2.getName().length()) {
            return 1;
        }

        return -1;
    }
}

class stdRollComparator2 implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getRoll() == o2.getRoll()) {
            return 0;
        }
        else if (o1.getRoll() < o2.getRoll()) {
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
