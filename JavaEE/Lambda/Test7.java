package JavaEE.Lambda;

import java.util.function.BiFunction;

public class Test7 {
    public static void main(String[] args) {
        testConstructorMethodRef();
    }
    public static void testConstructorMethodRef() {
        BiFunction<String, Integer, Student> s1 = new BiFunction<String, Integer, Student>() {
            @Override
            public Student apply(String name, Integer age) {
                return new Student(name, age);
            }
        };
        //lambda表达式
        BiFunction<String, Integer, Student> s2 = (name, age) -> new Student(name, age);
        //对应的方法引用
        BiFunction<String, Integer, Student> s3 = Student::new;
        //使用
        System.out.println(getStudent("cuiHuaNiu", 20, s3).toString());
    }

    private static Student getStudent(String name, int age, BiFunction<String, Integer, Student> biFunction) {
        return biFunction.apply(name, age);
    }


}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

