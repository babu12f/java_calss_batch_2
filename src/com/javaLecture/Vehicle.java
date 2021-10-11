package com.javaLecture;

public class Vehicle {
    String color;

    public void run() {
        System.out.println("running");
    }
}

class Car extends Vehicle {
}

class SportsCar extends Car {
    int speed = 80;

    public void run() {
        System.out.println("running at speed " + this.speed);
    }

    public void speedUp() {
        this.speed = this.speed + 10;
    }
}
