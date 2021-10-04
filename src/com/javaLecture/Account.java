package com.javaLecture;

public class Account {
    private String name;
    private Double balance;

    public void deposit(Double amount) {
        balance = balance + amount;
    }

    public void withDraw(Double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
    }

    public Double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String userName) {
        name = userName;
    }

    private void someMethod() {
        System.out.println("some method");
    }
}
