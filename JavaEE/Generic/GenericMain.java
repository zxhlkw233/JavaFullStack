package JavaEE.Generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * https://zhuanlan.zhihu.com/p/267335337
 * 为什么<? extends T>会让
 * List<? extends Father> list = new LinkedList<>();
 * list.add(son);
 * 而 <? super T>
 *  List<? super Father> list = new LinkedList<>();
 *  list.add(son);
 * 不会让他报错
 * 不是说super 表示是 T的父类直至Object类吗，extends是T或者它的子类
 * */
public class GenericMain {
    public static void main(String[] args) {
        List<? super Father> list = new LinkedList<>();
        list.add(new Son());
        System.out.println(list.get(0).getClass());
        List<? extends Father> list1 = new ArrayList<>();
//        list1.add(new Lei()); //extends还是会让它报错
        List<? super Father> list2 = new ArrayList<>();
//        list2.add(new Human());  //这里反倒父类传进去会报错，子类不会
    }
}

class Human {

}

class Father extends Human {

}

class Son extends Father {

}

class Lei extends Father {

}