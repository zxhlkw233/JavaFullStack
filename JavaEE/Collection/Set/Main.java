package JavaEE.Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        boolean add = hashSet.add("1");
        System.out.println(add);
        boolean contains = hashSet.contains("1");
        System.out.println(contains);
        Iterator iterator = hashSet.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //set转list
        List<String> list = new ArrayList<>(hashSet);
        System.out.println(list);

        //set转list
        List<String> list1 = new ArrayList<>();
        list1.addAll(hashSet);
        System.out.println(list1);

        //list转set相反，但是注意：list转set某些数据可能就没了，因为set不允许重复



    }
}
