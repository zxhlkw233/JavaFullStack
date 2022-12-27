package JavaEE.Collection.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List_map {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Map<Integer,Integer>> list = new ArrayList<>();
        map.put(1,2);
        list.add(map);
        System.out.println(list);
    }
}
