package CodingBut.Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class noX {

    public static List<String> noXMethod(List<String> str) {
        List<String> result = str.stream()
                .map(n -> n.replaceAll("x", ""))
                .collect(Collectors.toList());
        return result;
    }

    public static List<Integer> square(List<Integer> nums) {
        List<Integer> result = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        return result;
    }

    public static List<String> moreY(List<String> strings) {
        List<String> result = strings.stream()
                .map(n -> n.replaceAll(n, "y" + n + "y"))
                .collect(Collectors.toList());
        return result;
    }

    public static List<String> addStar(List<String> strings) {
        List<String> result = strings.stream()
                .map(n -> n.concat("*"))
                .collect(Collectors.toList());
        return result;
    }
    public static List<Integer>math1(List<Integer>nums){
        List<Integer>result = nums.stream()
                .map(n->(n+1)*10)
                .collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addStar(List.of("*")));
    }

}