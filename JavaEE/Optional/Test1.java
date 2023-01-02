package JavaEE.Optional;

import JavaEE.Reflect.User;

import java.util.Optional;

public class Test1 {
    public static void a(){
        //这样写依然会报错
        Optional<User> empty = Optional.empty();
        empty.get();
    }
    //这种不会报错
    public static void b(){
        Optional<User> user = Optional.of(new User());
        user.get();
    }
    //如果对象即可能是 null 也可能是非 null，你就应该使用 ofNullable() 方法：
    public static void c(){
        Optional<User> user = Optional.ofNullable(new User());
        user.get();
    }


    public static void main(String[] args) {
        c();
    }
}
