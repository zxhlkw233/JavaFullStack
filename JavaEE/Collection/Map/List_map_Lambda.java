package JavaEE.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List_map_Lambda {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Map<Integer,String> map = new HashMap<>();
        List<Map> mapList = new ArrayList<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        mapList.add(map);
        test1.fun(mapList);
    }
}
class Test1{
    public void fun(List<Map> mapList){
        mapList.forEach(map ->{
            System.out.println(map);
        });
//        HashMap<Integer,String> map = new HashMap<>();
//        mapList.forEach(map ->{
//
//        });会报错
//        mapList.forEach(new HashMap<Integer,String>()->{
//
//        });
        /*
        * 这样也会报错，不是说<? super Map>就能传进去吗，怎么会报错呢
        * */
    }
}
