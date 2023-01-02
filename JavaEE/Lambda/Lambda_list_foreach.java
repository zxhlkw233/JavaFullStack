package JavaEE.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda_list_foreach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.forEach(s -> System.out.println(s));

    }
}
