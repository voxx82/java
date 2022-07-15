package org.example.lesson2;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson2 {
    public static void main(String[] args) {

        NumberList<Integer> list = new NumberList<>(Integer.class); // как это работает?
        NumberList<Integer> list2 = new NumberList<>(Integer.class);
        list.add(1);
        list.add(2);
        list.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(33);
        System.out.println(list.getClass());
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list.sumIntegers());
        System.out.println(list.equals(list2));
//        System.out.println("Лист содержит 4 (2 и более раз) - " + list.contains((Integer)4));
//        System.out.println("Начальный лист - " + list);
//        list.remove((Integer)3);
//        System.out.println("Лист после удаления 3 - " + list);

        ArrayList ss = new ArrayList();


//        MyList<String> list = new MyList<>(String.class);
//        list.add("hello");
//        list.add("hello2");
//        list.add("hello3");
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("hello2");
//        list2.add("hello3");
//        list2.add("hello4");
//        list2.add("hello5");
//        list2.add("hello6");
//
//        System.out.println(list.containsAll(list2));
//        list.addAll(list2);
//        System.out.println(list);
//
//        int hello2 = list.indexOf("hello2");
//        int hello = list.lastIndexOf("hello");
//        System.out.println(hello2);
//        System.out.println(hello);


    }
}