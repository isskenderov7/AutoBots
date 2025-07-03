package CodingBut.Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class X2 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1,22,93);
        String numToString = nums.toString();
        for (int num:nums){
            num= numToString.length()-1;
            System.out.println(num);
        }

    }


    public List<Integer>doubling(List<Integer>nums){
nums.replaceAll(n->n*2);
return nums;
    }

    public List<String>copies3(List<String>str){
        str.replaceAll(n->n+n+n);
        return str;
    }
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());


return nums;
    }
}
