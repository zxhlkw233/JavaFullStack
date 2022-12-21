package JavaEE.Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.toArray();
        List<int[]> list1 = new ArrayList<int[]>();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3};
        list1.add(arr1);
        list1.add(arr2);
        list1.add(arr3);
        System.out.println(list1);

        //添加
        List<String> list2 = new ArrayList<String>(){{add("a");add("b");}};
        System.out.println(list2);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(1);
        list3.add(1);
        list3.add(1);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(1);
        list4.add(1);
        list4.add(1);
        list4.get(1);

    }
}
