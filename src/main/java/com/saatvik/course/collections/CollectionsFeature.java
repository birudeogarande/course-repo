package com.saatvik.course.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsFeature {


    public static final String _BIRUDEO = "Birudeo";

    public static void main(String[] args) {

        List<String> list = new java.util.ArrayList<>(Collections.nCopies(10, _BIRUDEO));

        list.forEach(System.out::println);

        var elements = List.of(1, 2, 3, 4, 5, 6, 7, 8, 6, 6, 6, 6, 6);
        var element2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 6, 6, 6, 6, 6);
       var element3 = List.of(90);
        var disjoint = Collections.disjoint(elements, element3);

        System.out.println(STR."disjoint = \{disjoint}");

        int frequency = Collections.frequency(elements, 6);

        System.out.println(frequency);

        var map = elements
                .stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> Collections.frequency(elements, n),
                        Integer::min));

        System.out.println(map);

        System.out.println("Rotate list/Collections");

        var listToRotate = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(listToRotate);
        Collections.rotate(listToRotate,-15);
        System.out.println(listToRotate);

    }
}
