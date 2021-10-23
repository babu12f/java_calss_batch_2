package com.javaLecture;

import java.util.*;

public class Class13 {

    public static void main(String[] args) {

       /* int[] data = new int[100];
        data[0] = 12;

        System.out.println(data.length);*/

        /*ArrayList<Integer> myArrayList = new ArrayList<>();

        //System.out.println(myArrayList.isEmpty());

        myArrayList.add(20);
        myArrayList.add(21);
        myArrayList.add(40);*/

        /*System.out.println(myArrayList.isEmpty());

        int listSize = myArrayList.size();

        for (int i = 0; i < listSize; i++) {
            System.out.println(myArrayList.get(i));
        }

        myArrayList.remove(0);

        System.out.println("List after remove one element");
        for (int a : myArrayList) {
            System.out.println(a);
        }*/

        /*System.out.println(myArrayList.contains(21));

        Iterator<Integer> iterator = myArrayList.iterator();*/

        /*System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/

        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        /**

         20 21 40 50 60

         * */

        /*
        * LinkedList<Integer> ll = new LinkedList<>();
        *
        * Vector<Integer> vv = new Vector<>();
        *
        * */

        List<Integer> ll = new LinkedList<>();
        List<Integer> vv = new Vector<>();


        ArrayList<String> strList = new ArrayList<>();
        strList.add("ruhit");
        strList.add("abrar");

        /*Iterator<String> it = strList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(strList.contains("abrar"));*/
        for (String s : strList) {
            System.out.println(s);
        }

        /*ArrayList<String> list2 = new ArrayList<>();
        list2.add("sabbir");
        list2.add("kahlid");

        System.out.println("list value after add all");
        strList.addAll(list2);
        for (String s : strList) {
            System.out.println(s);
        }

        strList.removeAll(list2);
        System.out.println("\n\nlist value after remove all");
        for (String s : strList) {
            System.out.println(s);
        }*/

        strList.add(0, "sabbir");
        strList.add("sabbir");
        strList.set(3, "sabbir-2");
        printList(strList);

//        System.out.println(strList.indexOf("sabbir"));
        System.out.println(strList.lastIndexOf("sabbir"));


    }

    private static void printList(ArrayList<String> d) {
        System.out.println("\n\nList data: ");
        for (String s : d) {
            System.out.println(s);
        }
    }

}
