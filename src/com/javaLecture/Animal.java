package com.javaLecture;

public abstract class Animal {
    private int numberOfLeg;

    public Animal(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public abstract void food();
}
