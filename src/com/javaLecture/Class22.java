package com.javaLecture;

public class Class22 {

    public static void main(String[] args) {

        //Annoynymous class
       /* Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Printing data By HP Printer");
            }

            @Override
            public void scan() {
                System.out.println("Scanning data By HP Printer");
            }
        };

        printer.print();*/

       /*Printer printer = new Printer() {
           @Override
           public void print() {
               System.out.println("printing by anonynmous printer");
           }
       };*/

        //lambda expresion
        /*Printer printer = () -> {
            System.out.println("printing by lambda printer");
        };
       printer.print();*/

        //Printer printer = new KenonPrinter();
        Printer printer = () -> System.out.println("printing by lambda printer");

        printDocument(printer);
    }

    public static void printDocument(Printer printer) {
        printer.print();
    }
}

@FunctionalInterface
interface Printer {
    void print();
    //void scan();
}

class KenonPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printing data");
    }

    /*@Override
    public void scan() {
        System.out.println("Scanning data");
    }*/
}

