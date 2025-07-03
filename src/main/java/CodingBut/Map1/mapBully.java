package CodingBut.Map1;

import java.util.HashMap;
import java.util.Map;

public class mapBully {
    public static void main(String[] args) {

Map<String,String>map=new HashMap<>();
map.put("a", "candy");
map.put("b", "dirt");
map.put("c", "ccc");
        System.out.println(mapShareMethod(map));

    }

    public static Map<String,String>mapBullyMethod(Map<String,String> map){
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;
    }

    public static Map<String,String>mapShareMethod(Map<String,String>map){
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.remove("c");
        }else {
            map.remove("c");
        }
        return map;
    }

    public static Map<String,String>mapAB(Map<String,String>map){
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }

    public static Map<String,String>mapIceCream(Map<String,String>map){
        if (map.containsKey("ice cream")){
            map.put("ice cream","cherry");
            map.put("bread","butter");
        }else {
            map.put("bread","butter");
        }
        return map;
    }
    public static Map<String,String>topping2(Map<String,String>map){
        if(map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        return map;
    }
    public static Map<String,String>topping3(Map<String,String>map){
        if(map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }
        if(map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }
        return map;
    }
    public static Map<String,String>mapAB2(Map<String,String>map){
if(map.containsKey("a")&& map.containsKey("b")){
    if (map.get("a").equals(map.get("b"))){
        map.remove("a");
        map.remove("b");
    }
}
return map;

    }
    public static Map<String,String>mapAB3(Map<String,String>map) {
if(map.containsKey("a") && !map.containsKey("b")){
        map.put("b",map.get("a"));
    }if(map.containsKey("b") && !map.containsKey("a")){
        map.put("a",map.get("b"));
    }
return map;
    }

    public static Map<String,String>mapAB4(Map<String,String>map) {
        String valueA = map.get("a");
        String valueB = map.get("b");
    if(map.containsKey("a") && map.containsKey("b")){
        if(valueA.length() > valueB.length()){
            map.put("c", map.get("a"));
        }
        if(valueB.length() > valueA.length()){
            map.put("c", map.get("b"));
        }
        if(valueA.length()==valueB.length()){
            map.put("a","");
            map.put("b","");
        }
    }
    return map;
    }

    }
