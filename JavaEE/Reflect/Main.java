package JavaEE.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<User> userClass = User.class;
        //获取所有private方法，
//        Method[] declaredMethods = userClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }


        //获取所有public方法
//        Method[] methods = userClass.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

        //获取指定的public方法
//        Method method4 = userClass.getMethod("method4");
//        System.out.println(method4);

        //获取公有成员变量信息
//        Field[] fields = userClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

        //获取私有成员变量信息
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }


    }

}
