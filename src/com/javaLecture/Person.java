package com.javaLecture;

public class Person {
    private String name;
    private int age;
    private final String country = "bangaledesh";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public void walk() {
        System.out.println("walking");
    }

    public void walk(int speed) {
        System.out.println("walking at speed: " + speed);
    }

    public void walk(int speed, double d) {
        System.out.println("walking at speed: " + speed);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }
}