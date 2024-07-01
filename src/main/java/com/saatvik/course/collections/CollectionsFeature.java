package com.saatvik.course.collections;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsFeature {

    public static final String _BIRUDEO = "Birudeo";

    public static void main(String[] args) {

        List<String> list = Collections.nCopies(10, _BIRUDEO);

        list.forEach(System.out::println);

        var elements = List.of(1, 2, 3, 4, 5, 6, 7, 8, 6, 6, 6, 6, 6);
        int frequency = Collections.frequency(elements, 6);

        System.out.println(frequency);

        var map = elements
                .stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> Collections.frequency(elements, n),
                        Integer::min));

        System.out.println(map);
    }
}
