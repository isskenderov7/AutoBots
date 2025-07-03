package CodingBut.Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class noNeg {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(-1);
        nums1.add(509);
        nums1.add(1);
        System.out.println(noNegMethod(nums1));
    }

    private static List<Integer> noNegMethod(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    private static List<String> noZ(List<String> str) {
        List<String> result = str.stream()
                .filter(s -> !s.contains("s"))
                .collect(Collectors.toList());
        return result;
    }

    private static List<Integer> nonegg(List<Integer> nums) {
        return nums.stream()
                .filter(s -> s >= 0)
                .collect(Collectors.toList());
    }


    public static List<String>no34(List<String>str){
        return str.stream()
                .filter(s->s.length()!=3 && s.length()!=4)
                .collect(Collectors.toList());
    }
    public static List<String>noYY(List<String>str) {
        return str.stream()
                .filter(s -> !s.endsWith("y"))
                .filter(s->!s.contains("yy"))
                .map(s->s.replaceAll(s,s+"y"))
                .collect(Collectors.toList());
    }


    private static List<Integer>two2(List<Integer>nums){
        return nums.stream()
                .map(s->s*2)
                .filter(s -> !s.toString().endsWith("2")  )
                .collect(Collectors.toList());
    }

    private static List<Integer>square56(List<Integer>nums){
        return nums.stream()
                .map(s->s*s+10)
                .filter(s -> !s.toString().endsWith("5")  )
                .filter(s -> !s.toString().endsWith("2")  )
                .collect(Collectors.toList());
    }


}

