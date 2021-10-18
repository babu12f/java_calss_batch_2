package com.javaLecture;

public class Cat extends Animal {

    public Cat(int numberOfLeg) {
        super(numberOfLeg);
    }

    @Override
    public void food() {
        System.out.println("cat food is grass");
    }
}

class Tiger extends Animal {

    public Tiger(int numberOfLeg) {
        super(numberOfLeg);
    }

    @Override
    public void food() {
        System.out.println("tiger food is meat");
    }
}
