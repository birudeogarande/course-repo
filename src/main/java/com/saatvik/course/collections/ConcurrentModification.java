package com.saatvik.course.collections;

import java.util.Arrays;
import java.util.List;

public class ConcurrentModification {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        for (Integer i:list){
//            list.add(11);  //	at com.saatvik.course.collections.ConcurrentModification.main(ConcurrentModification.java:12)
        }
//        System.out.println(list);


        list.stream()
                .filter(i->i%2==0)
                .forEach(i->{
                    list.add(11);
                    System.out.println(i);
                });

    }
}
