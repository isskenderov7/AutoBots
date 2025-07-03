package CodingBut.Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class toLowerCase {
    public static void main(String[] args) {
        List<String>lower1 =new ArrayList<>();
        lower1.add("Hello");
        lower1.add("Hi");

    }
    public static List<String>lowerCasee(List<String>lower) {
       List<String>result = lower.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    return result;
    }
}
