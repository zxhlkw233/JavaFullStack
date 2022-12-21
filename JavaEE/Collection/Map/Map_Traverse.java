package JavaEE.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Traverse {
    public static  final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}');put('[',']');put('(',')');put('?','?');
    }};
    public static void main(String[] args) {
        //使用iterstor+keyset写法
        Iterator<Character> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Character next = iterator.next();
            System.out.println(next);
            System.out.println(map.get(next));
        }

        //foreach遍历方式 jdk1.8一下推荐写法
        for(Map.Entry<Character,Character> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry.getClass());
        }
        //Lambda表达式遍历 jk1.8推荐写法
        map.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });

        //stream流遍历Map
//        Set<Map.Entry<Character, Character>> entries = map.entrySet();
        map.entrySet().stream().forEach((Map.Entry<Character,Character> entry) ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
