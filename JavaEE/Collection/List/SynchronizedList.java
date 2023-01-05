package JavaEE.Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedList {
    public static void main(String[] args) {
        /*
        * 并发情况下，arraylist是线程不安全的，
        * 使用一下方法可以做到读写分离？
        * */
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list1 = new CopyOnWriteArrayList<>();
    }
}
