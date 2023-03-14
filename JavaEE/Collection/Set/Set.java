package JavaEE.Collection.Set;

import java.util.*;
/*
*
Set set=new HashSet();
add(obj):添加一个对象
remove(obj):直接删除一个元素
clear():清空容器
size():容器的大小
isEmpty():判断是否为空
equal():判断两个集合是否相等，若两个集合里面的元素相等，则它们的hashCode()相等，两个集合也相等

*
* */
public class Set {
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

        //判断是否重复
        java.util.Set<Integer> set = new HashSet<>();
        set.add(1);

        System.out.println(set.add(1)); //如果添加重复返回false
        System.out.println(set.contains(1));//如果包含这个数值，返回true

        System.out.println(set.add(2));//true
        System.out.println(set.contains(3));//false

        //set转换为数组
        java.util.Set<Integer> set1 = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        int[] array = new int[set.size()];
        
        set.toArray();

    }
}
