package JavaEE.Collection.Map;

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
        map.put(5,3);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        System.out.println(map.size());//map的长度
        System.out.println(map.isEmpty());//判断map是否为空
        System.out.println(map.containsKey(1));//判断map是否包含key
        System.out.println(map.containsValue(2));//判断map是否包含value

        System.out.println(map);



        //Map.Entry 是Map中的一个接口，他的用途是表示一个映射项（里面有Key和Value）
        System.out.println();
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
