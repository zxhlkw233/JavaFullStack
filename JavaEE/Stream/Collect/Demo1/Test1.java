package JavaEE.Stream.Collect.Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"a","A"));
        list.add(new Person(2,"b","B"));
        list.add(new Person(3,"c","C"));
        list.add(new Person(4,"d","D"));
        System.out.println(list);

        List<Person> list1 = new ArrayList<Person>(){{
            new Person(1,"a","A");
            new Person(2,"b","B");
            new Person(3,"c","C");
            new Person(4,"d","D");
        }};
        System.out.println(list1);

        //把list列表中各个Person实例的id属性收集到 一个list中
        List<Integer> collect = list.stream().map(x -> x.getId()).collect(Collectors.toList());
        List<String> collect1 = list.stream().map(y -> y.getName()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }
}
