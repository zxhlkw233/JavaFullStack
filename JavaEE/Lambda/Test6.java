package JavaEE.Lambda;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小明", 12));
        list.add(new Person("小王", 23));
        list.add(new Person("小刘", 6));
        list.add(new Person("小周", 43));
        list.add(new Person("小胡", 12));
        list.add(new Person("小白", 6));
        list.add(new Person("小黑", 21));
        //正着减 是递增排序，倒着减是递减排序
        list.sort((a1,a2) -> a1.getAge() -a2.getAge());//从小到大
        list.sort((a1,a2) -> a2.getAge() -a1.getAge());//从大到小
        list.forEach(System.out::println);
        Runnable as_ = () -> System.out.println("as ");
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
