package JavaEE.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Stream<Integer> stream = list.stream();
        stream.filter(x -> x > 2).forEach(System.out::println);


        List<String> list1 = new ArrayList<>();
        list1.add("m,k,l,n");
        list1.add("1,2,3,4");
        List<String> stringStream = list1.stream().flatMap(s -> {
            String[] split = s.split(",");
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        }).collect(Collectors.toList());
        System.out.println(stringStream);

        Stream<Integer> stream1 = Stream.of(1,9,10,6,8,3);
//        stream1.sorted().forEach(System.out::println);
        System.out.println("result="+stream1.allMatch(s->s>=1));

        List<String> list2 = Arrays.asList("Jhonny", "David", "jack", "Duke", "Jill", "Dany", "Julia", "Divya");
        String j = list2.parallelStream().filter(s -> s.startsWith("J")).findAny().get();
        System.out.println(j);
    }
}
