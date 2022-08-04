package com.cg;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        List<String> s1 = Arrays.asList("ss","dd","ss","dd","dd");
        List<Integer> num = Arrays.asList(10,28,87,10,20,76,28,80,80,80);
        List<Character> ch = Arrays.asList('n','a','n','d','k','i','s','h','o','r','e');
        Set<Integer> hs = new HashSet<>();
        Map<String, Integer> hm = new HashMap<>();
        List<List<Integer>> list = Stream.of(Arrays.asList(76,42,20,32,10,26)).collect(Collectors.toList());

        num.stream().filter(e->!hs.add(e)).collect(Collectors.toSet()).forEach(System.out::println);

//        Map<String, Long> countWord = s1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, List<String>> countWord = s1.stream().collect(Collectors.groupingBy(e->e.toUpperCase()));
        System.out.println(countWord);

        Map<Character, Long> countChar = ch.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countChar);

        /*Map<String, Long> wordCoutMap = s1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordCoutMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue());
        System.out.println(wordCoutMap);*/

        Map<String, Long> wordCoutMap = s1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue()).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        System.out.println(wordCoutMap);

        Map<String, Long> wordCoutMapRev = s1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        System.out.println(wordCoutMapRev);

        //flatmap
        list.stream().flatMap(no->no.stream().sorted()).forEach(System.out::println);
    }
}
