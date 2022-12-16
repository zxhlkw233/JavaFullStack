package JavaEE.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Test {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new TreeMap<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        map.put(1,2);
        map.put(6,7);
        map.put(2,4);
        map.put(3,6);
        map1.put(null,null);
        map1.put(1,null);
        map1.put(null,1);
        System.out.println(map1);
    }
}
