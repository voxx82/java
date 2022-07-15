package org.example.lesson2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson2 {
    public static void main(String[] args) {

        NumberList<Integer> list = new NumberList<>(Integer.class); // как это работает?
        NumberList<Integer> list2 = new NumberList<>(Integer.class);
        NumberList<Double> list3 = new NumberList<>(Double.class);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(33);

        list3.add(3.0);
        list3.add(32.0);
        list3.add(3.6);
        list3.add(5.0);
        list3.add(1.2);
       list.add(2, 23);
       list.add(2, 23);
        System.out.println(list);

        System.out.println(list.indexOf(23));
        System.out.println(list.lastIndexOf(23));
//        System.out.println(list3.getDouble(2));
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
//        System.out.println(list.equals(list2));
//        System.out.println("Лист содержит 4 (2 и более раз) - " + list.contains((Integer)4));
//        System.out.println("Начальный лист - " + list);
//        list.remove((Integer)3);
//        System.out.println("Лист после удаления 3 - " + list);



    }
}