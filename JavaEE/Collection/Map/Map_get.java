package JavaEE.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_get {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>(){{
           put(1,"a"); put(2,"b");put(3,"c");
        }};
        System.out.println(map.get(1));
    }
}
