package com.example.demo;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        String[] strings = {"aa", "aa", "1", "bbb", "aa", "abc", "cc", "abc", "aa", "aa", "dd", "aa", "aa", "bb", "aa", "cc", "aa", "aa", "dd"};
        Set<String> result = new LinkedHashSet<>(List.of(strings));
        System.out.println(result);
    }

    public static void task2() {
        Stream.of("aa", "aa", "1", "bbb", "aa", "abc", "cc", "abc", "aa", "aa", "dd")
                .distinct() // distinct() — метод исключает из стрима повторяющиеся элементы
                .forEach(System.out::println);
    }

}
