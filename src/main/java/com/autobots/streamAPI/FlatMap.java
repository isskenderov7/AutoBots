package com.autobots.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E")
        );
        System.out.println(nestedList);
        List<String>nonestedList = new ArrayList<>();
        for (List<String>list:nestedList){
            nonestedList.addAll(list);
        }
        System.out.println(nonestedList);
        System.out.println("______________");
        List<String>nonestedListWithStream = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(nonestedListWithStream);





    }
}
