package JavaEE.Generic.GenericClass1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Person person = new Person();
//        test3.fun(Person.class,1);
        Test4 test4 = new Test4();
        test4.print(Student.class);
    }
}
interface Test2{
    <T extends Person> T fun(Class<T> Student,int id);
}
class  Test3 implements Test2{

    @Override
    public <T extends Person> T fun(Class<T> Student, int id) {
        T t = (T) new Person();
        System.out.println(Student.getName());
        return t;
    }
}
class Test4<T>{
    public  void print(Class<T> s){
        Method[] methods = s.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
//        System.out.println(methods);
    }
}