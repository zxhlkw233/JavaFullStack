package JavaEE.Generic.GenericClass1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        test1(a);
    }
    public static <T> T test1(ArrayList<T> a){
        T t = a.get(0);
        return t;
    }
    public static void test2(ArrayList<?> a){
        Object o = a.get(0);
    }
    public static void test3(ArrayList a){
        Object o = a.get(0);
    }
}
