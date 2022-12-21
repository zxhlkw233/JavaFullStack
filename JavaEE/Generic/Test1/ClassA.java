package JavaEE.Generic.Test1;

public class ClassA <T>{
    public void fun(String a,Class<T> clazz){
        //这玩意一环扣一环的，要想在参数中写入Class<T> clazz,必须在类名后定义<T>
        System.out.println("类名："+clazz.getName());
    }

    public static void main(String[] args) {
        ClassA<Person> personClassA = new ClassA<>();
        personClassA.fun("a",Person.class);
        ClassA<User> userClassA = new ClassA<>();
        userClassA.fun("a", User.class);
    }
}
