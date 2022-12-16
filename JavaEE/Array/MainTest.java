package JavaEE.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//public class MainTest {
//    public static void main(String[] args) {
//        int [] nums = {1,2,3};
//        List<int[]> ints = Arrays.asList(nums);
//        List<int[]> ints1 = Arrays.asList(new int[]{1, 2, 3});
//    }
//}
public class MainTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.getClass());
        Object[] objects1 = list.toArray();
        System.out.println(objects1.getClass());
        Object[] objects = list.toArray();

    }
}
