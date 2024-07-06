package com.saatvik.course.collections;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindDuplicates {
    public static void main(String[] args) {

        CustomImmutable customImmutable = new CustomImmutable("Birudeo");

        System.out.println(customImmutable);
        // Initial stream
        Stream<Integer> stream = Stream.of(2, 17, 5, 20, 17, 30, 4, 23, 59, 23);

        Map<Integer, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(STR."Duplicate elements: \{entry.getKey()}, occurrence: \{entry.getValue()}"));

        String[] array = { "G", "E", "E", "k" };

        IntStream.range(0, array.length)
                .mapToObj(index->STR."\{index} -> \{array[index]}")
                .forEach(System.out::println);

    }
}
