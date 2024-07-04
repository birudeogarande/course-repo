package com.saatvik.course.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Birudeo", "Saatvik", "Harshad", "Dipali", "Hello");

        Movie dilwale = Movie.builder()
                .rating(100)
                .name("DIL-WALE")
                .actor("Ajay")
                .build();

        Optional<Integer> optional = Optional.empty();
        Optional<String> optionalString = optional.map(String::valueOf);

        System.out.println(optionalString.orElseGet(()->"Default Value"));

        System.out.println(dilwale);

        list.forEach(System.out::println);

        list.stream().map(str ->
                        str.charAt(0))
                .forEach(System.out::println);
    }
}
