package JavaEE.Generic.GenericClass1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Person person = new Person();
//        test3.fun(Person.class,1);
        //当反射使用
        Test4 test4 = new Test4();
//        test4.print(Student.class);
        //实验一下class Test5<T> 但不适用T有什么影响吗
        Test5 test5 = new Test5();
        test5.setS(1);
    }
}
interface Test2{
    <T extends Person> T fun(Class<T> Student,int id);
}
//上面这个如果看不懂，可以有这个写法
// <T extends Person> T 应该是 ‘通配符’: 又分为上界通配符和下界通配符
class Test6{
    <T> T get(){
        T t = null;
        return t;
    }
}
class  Test3 implements Test2{

    @Override
    public <T extends Person> T fun(Class<T> Student, int id) {
        T t = (T) new Person();
        System.out.println(Student.getName());
        return t;
    }
}
/*
* 我现在唯一能想到(Class<T> s)的作用就是 它可以随便传个类.Class,然后使用反射调用它，
* */
class Test4<T>{
    public  void print(Class<T> s){
        Method[] methods = s.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
//        System.out.println(methods);
    }
}
class Test5<T>{
    private int a;
    private T s;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public T getS() {
        return s;
    }

    public void setS(T s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Test5{" +
                "a=" + a +
                ", s=" + s +
                '}';
    }
}