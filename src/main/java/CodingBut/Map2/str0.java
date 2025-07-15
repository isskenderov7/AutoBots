package CodingBut.Map2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class str0 {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "a"};
        System.out.println(str00(strings));
    }

    private static Map<String, Integer> str00(String[] str) {
        Map<String, Integer> map = new TreeMap<>();

        for (String map1 : str) {
            map.put(map1, 0);
        }
        return map;
    }

    private static Map<String, Integer> wordLen(String[] str) {
        Map<String, Integer> map = new TreeMap<>();

        for (String map1 : str) {
            map.put(map1, 0);
        }
        return map;
    }

    private static Map<String, Integer> wordLength(String[] str) {
        Map<String, Integer> map = new TreeMap<>();

        for (String map1 : str) {
            map.put(map1, map1.length());
        }
        return map;
    }

    private static Map<String, Integer> Doublex2(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            if (countMap.containsKey(word)) {
                countMap.put(word, countMap.get(word) + 1);
            } else {
                countMap.put(word, 1);
            }
        }

        return countMap;
    }
//    private static Map<String, Integer> Double(String[] strings) {
//    Map<String,String> map = new HashMap<>();
//
//
//
//
//
//
//
//
//
//    }


}
