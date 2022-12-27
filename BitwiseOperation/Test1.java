package BitwiseOperation;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(list);
        int i = list.indexOf(3);
        System.out.println(i);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        System.out.println(2 & 1);
        int a1 = 1 & 2;
        System.out.println("a1 " + a1);
    }
}
