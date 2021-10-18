package com.javaLecture.anotherPacked;

import com.javaLecture.ClassA;

public class AnotherClass {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        b.met();
    }
}


class ClassB extends ClassA {
    public void met() {
        System.out.println(name);
    }
}