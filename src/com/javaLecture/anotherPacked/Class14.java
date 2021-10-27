package com.javaLecture.anotherPacked;

import java.util.*;

public class Class14 {
    public static void main(String[] args) {
        /*Vector<Integer> myList = new Vector<>();

        myList.add(100);
        myList.add(59);
        myList.add(4);
        myList.add(30);
        myList.add(100);*/

        /*for (Integer i: myList) {
            System.out.println(i);
        }*/

        /*List<Integer> l2 = new Vector<>();
        l2.add(59);
        l2.add(200);

        boolean containsAll = myList.containsAll(l2);

        System.out.println(containsAll);*/

        /*System.out.println( myList.elementAt(2));

        System.out.println(myList.size());

        myList.clear();

        System.out.println(myList.size());*/

        /*Integer[] myarr = new Integer[200];

        myList.copyInto(myarr);

        for (int i = 0; i < 5; i++) {
            System.out.println(myarr[i]);
        }*/

        /*System.out.println(myList.firstElement());

        System.out.println(myList.lastElement());

        int sz = myList.size();*/

        /*for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        //sort small to large
        Collections.sort(myList);

        //sort large to small
        Collections.sort(myList, Collections.reverseOrder());

        System.out.println("List after sort");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }*/

        //List<Integer> subList = myList.subList(1, 4);

        /*for (Integer a: myList) {
            System.out.println(a);
        }*/

        /*ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(56);
        l3.add(59);

        myList.addAll(l3);

        for (int a : myList) {
            System.out.println(a);
        }*/

        Stack<Integer> stk = new Stack<>();

        //System.out.println(stk.empty());
        stk.push(5);
        stk.push(10);
        stk.push(40);

        /*System.out.println(stk.size());

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println("stack size: "+stk.size());*/

        /*while (!stk.isEmpty()){
            System.out.println(stk.pop());
        }*/

        /*System.out.println(stk.peek());
        System.out.println(stk.size());*/

        System.out.println(stk.search(123));




    }
}
