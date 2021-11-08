package com.javaLecture;

import java.util.*;

public class Class16 {

    public static void main(String[] args) {
        //List<Student> stdList = new ArrayList<>();

        Student s3 = new Student(3, "abrar");
        Student s1 = new Student(1, "khalid");
        Student s2 = new Student(4, "ruhit");
        Student s4 = new Student(5, "saiful");

        /*stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);
        stdList.add(s4);*/

        //stdList.sort(new stdRollComparator());
        //Collections.sort(stdList, new stdRollComparator());

        /*Collections.sort(stdList);
        for(Student s: stdList){
            System.out.println(s);
        }*/

        //Student student = new Student(3, "nadim");
        //System.out.println(student);

        //student.compareTo(s2);

        /*Priority queue*/

       /* Queue<Student> myQ = new PriorityQueue<>();
        myQ.add(s1);
        myQ.add(s2);
        myQ.add(s3);
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());*/

       Map<String, Integer> myMap = new HashMap<>();
       //Map<String, Integer> myMap = new TreeMap<>();
       //Map<String, Integer> myMap = new LinkedHashMap<>();
       //Map<String, Integer> myMap = new Hashtable<>();
       myMap.put("r", 30000000);
       myMap.put("k", 50000000);
       myMap.put("l", 40);

        /*System.out.println(myMap.get("r"));
        System.out.println(myMap.get("k"));*/

        /*System.out.println(myMap);
        myMap.remove("k");
        System.out.println(myMap);

        if (myMap.containsKey("ky")) {
            System.out.println(myMap.get("ky"));
        }

        System.out.println(myMap.size());*/

        System.out.println(myMap);

        Set<String> keys = myMap.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println(myMap.get(k));
        }

       /* Collection<Integer> values =  myMap.values();

        System.out.println(values);*/


    }
}

class Student implements Comparable<Student> {
    private Integer roll;
    private String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void someMethod() {
        System.out.println(this);
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

    //@Override
    public int compareTo(Student o2) {
        //return o2.roll.compareTo(this.roll);

        Student o1 = this;
        if (o1.getRoll() == o2.getRoll()) {
            return 0;
        }
        else if (o1.getRoll() > o2.getRoll()) {
            return 1;
        }

        return -1;
    }
}