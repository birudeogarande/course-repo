package com.saatvik.course.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class StringReplacementDemo {

    public static final String SPACE = " ";

    public static void appendString(String str){

        System.out.print(STR." \{str} \{SPACE}");
    }
    /**
     * @param str1
     * @param output
     * @param input
     */
    public static void replaceStringExceptFistAndLastOccerance(String str1, String input, String output) {
        List<String> list = Arrays.asList(str1.split(SPACE));
        int index = list.indexOf(input);
        int last = list.lastIndexOf(input);
        UnaryOperator<String> operator = t -> {
            if (t.equals(input)) {
                return output;
            }
            return t;
        };
        list.replaceAll(operator);
        list.set(index, input);
        list.set(last, input);

//        list.forEach(StringReplacementDemo::appendString);

        list.stream().collect(Collectors.joining(SPACE));

        String finalString = String.join(SPACE, list);

        System.out.println(finalString);
    }

    public static void main(String[] args) {

        String str1 = "a creature is a small part of a big world";
        String input = "a";
        String output ="the";
        replaceStringExceptFistAndLastOccerance(str1,input,output);
    }
}