package com.javaLecture;

public class Class8 {
    public static void main(String[] args) {
        // OOP
        // Object
        // state/property/data ->
        // behavior

        /*Person obj = new Person();
        obj.name = "abrar";
        obj.age = 22;
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.walk();*/

        Account abararAccount = new Account();
        abararAccount.setName("abrar");

        System.out.println(abararAccount.getName());
        System.out.println(abararAccount.getBalance());

        abararAccount.deposit(1000.0);
        System.out.println(abararAccount.getBalance());

        abararAccount.deposit(500.0);
        System.out.println(abararAccount.getBalance());

        abararAccount.withDraw(300.0);
        System.out.println(abararAccount.getBalance());

        abararAccount.withDraw(30000.0);
        System.out.println(abararAccount.getBalance());
    }
}

