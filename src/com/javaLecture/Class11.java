package com.javaLecture;

public class Class11 {

    public static void main(String[] args) {
       /*Cat c = new Cat(4);
        Tiger t = new Tiger(4);

        c.food();
        t.food();*/

        MyInterface soObj = new MyInterfaceImpl();
        soObj.myMethod();
        ClassA obj = new ClassA();
        obj.name = "our name";

        System.out.println(obj.name);
    }

}
