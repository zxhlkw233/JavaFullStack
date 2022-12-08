package JavaEE.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(5,6);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
