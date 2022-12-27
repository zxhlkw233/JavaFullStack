package JavaEE.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //https://blog.csdn.net/QiuHaoqian/article/details/120942134
        //1.如何生成流
        //通过集合生成
        List<Integer> integerList = Arrays.asList(9,4,8,7,1,2,3);
        Stream<Integer> stream = integerList.stream();
        //通过数组生成
        int[] intArr = {6,5,4,3,2,1};
        IntStream stream1 = Arrays.stream(intArr);
        //通过值生成
        Stream<Integer> stream2 = Stream.of(6,5,4,3,2,1);
        //通过文件生成
        //通过函数生成

        //2.流的操作 中间操作，终端操作
        //2.1中间操作
        //2.1.1 filter筛选
        Stream<Integer> stream3 = integerList.stream().filter(i -> i > 3);
//        stream3.forEach(System.out::println);
        //2.1.2 distinct 去重
        List<Integer> integerList1 = Arrays.asList(1,1,2,2,3,3);
        Stream<Integer> stream4 = integerList1.stream().distinct();
//        stream4.forEach(System.out::println);
        List<String> stringList = Arrays.asList("a","a","b","b");
        Stream<String> stream5 = stringList.stream().distinct();
//        stream5.forEach(System.out::println);
        //2.1.3 limit 返回指定的个数
        List<Integer> integerList2 = Arrays.asList(1,1,2,3,4);
        Stream<Integer> limit = integerList2.stream().limit(3);
//        limit.forEach(System.out::println);
        //2.1.4 skip 跳过流中指定个数
        List<String> stringList1 = Arrays.asList("a","b","c","d","e");
        Stream<String> skip = stringList1.stream().skip(2);
//        skip.forEach(System.out::println);
        //2.1.5 map 流映射
        List<String> stringList2 = Arrays.asList("Java 8","Lambda","IN","Action");
        List<Integer> collect = stringList2.stream()
                .map(String::length)
                .collect(Collectors.toList());
//        System.out.println(collect);
        //输出：[6, 6, 2, 6]
        List<String> stringList3 = Arrays.asList("a","b","c","d");
        List<Integer> collect2 = stringList2.stream()
                .map(String::length)
                .collect(Collectors.toList());
//        System.out.println(collect2);

        //匹配所有元素
        List<Integer> integerList3 = Arrays.asList(1,2,3,4,5);
//        if(integerList3.stream().allMatch(i -> i >3)){
//            System.out.println("所有元素都大于3");
//        }else{
//            System.out.println("并非所有元素值都大于3");
//        }
        //noneMatch() 全部不匹配

        //count 统计流中元素个数
        List<Integer> integerList4 = Arrays.asList(1,2,3,4,51);
        long count = integerList4.stream().count();
//        System.out.println(count);

        //findFirst查找第一个
        List<Integer> integerList5 = Arrays.asList(1,2,3,4,5);
        Optional<Integer> first = integerList5.stream().filter(i -> i > 2).findFirst();
//        System.out.println(first);

        //findAny 随机查找一个
        List<Integer> integerList6 = Arrays.asList(1,2,3,4,5);
        Optional<Integer> any = integerList6.stream().filter(i -> i > 2).findAny();
//        System.out.println(any);

        //reduce 将流中的元素组合
        List<Integer> integerList7 = Arrays.asList(1,2,3,4);
        Integer reduce = integerList7.stream().reduce(0, Integer::sum);
//        System.out.println(reduce);

        //获取最大值
        List<Integer> integerList8 = Arrays.asList(1,2,3,4,5);
        Optional<Integer> reduce1 = integerList8.stream().reduce(Integer::min);
        Optional<Integer> reduce2 = integerList8.stream().reduce(Integer::max);
//        System.out.println(reduce1);
//        System.out.println(reduce2);
        List<String> stringList4 = Arrays.asList("Java 8","Lambda","In","Action");
        Optional<Integer> reduce3 = stringList4.stream().map(String::length).reduce(Integer::min);
        Optional<Integer> reduce4 = stringList4.stream().map(String::length).reduce(Integer::max);
        System.out.println(reduce3);
        System.out.println(reduce4);

    }
}
