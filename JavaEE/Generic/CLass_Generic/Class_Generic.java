package JavaEE.Generic.CLass_Generic;



public class Class_Generic {
    public static <T extends Grandpa> T fun(Class<T> clazz){
        return null;
    }
//    public static <T super Father> T fun1(Class<T> clazz){
//        return null;
//    }
    /*
    * 没有 public static <T super Father> T fun1(Class<T> clazz) 这个写法
    * */
    public static void main(String[] args) {
        fun(Father.class);
        fun(Son.class);
//        fun(Test1.class); //为什么Test1不行，因为Test不是 Grandpa的子类
    }
}


