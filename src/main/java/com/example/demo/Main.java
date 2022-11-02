package com.example.demo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] strings = {"aa", "aa", "1", "bbb", "aa", "abc", "cc", "abc", "aa", "aa", "dd", "aa", "aa", "bb", "aa", "cc", "aa", "aa", "dd"};
        Set<String> result = new LinkedHashSet<>(List.of(strings));
        System.out.println(result);
    }

}
