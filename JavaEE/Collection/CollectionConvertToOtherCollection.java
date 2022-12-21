package JavaEE.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionConvertToOtherCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        //list转换为set
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        //set转换为set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        List<Integer> list1 = new ArrayList<>(set1);


    }
}
