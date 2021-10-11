package com.javaLecture;

public class Animal {
    private String name;

    public void eat() {
        System.out.println("Eating");
    }

    private void sleep() {
        System.out.println("sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
