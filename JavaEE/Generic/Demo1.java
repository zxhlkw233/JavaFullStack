package JavaEE.Generic;

public class Demo1 {
    public static void main(String[] args) {

    }
}
class fun<T>{
    private T age;

    public fun(T age) {
        this.age = age;
    }
}
class sun<T>{
    private int age;

    public sun(int age) {
        this.age = age;
    }
}
interface hello<K,V>{
    public int dao(V vo);
}

interface hello1<K,V>{
    public int dao(V vo);

    public int sao(K [] a,V vo);
}
class helloImpl2 implements hello1<String,Integer>{

    @Override
    public int dao(Integer vo) {
        return 0;
    }

    @Override
    public int sao(String[] a, Integer vo) {
        return 0;
    }
}

class helloImpl implements hello<Integer,Integer>{

    @Override
    public int dao(Integer vo) {
        return 0;
    }
}
class helloImpl1 implements hello<String,Integer>{


    @Override
    public int dao(Integer vo) {
        return 0;
    }
}
