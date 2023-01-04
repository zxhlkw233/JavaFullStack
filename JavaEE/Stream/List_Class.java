package JavaEE.Stream;

import java.util.ArrayList;
import java.util.List;

public class List_Class {
    public static void main(String[] args) {
        List<Person1> person1List = new ArrayList<>();
        Person1 p3 = new Person1();
        p3.setAge(1);
        p3.setName("11");
        p3.setDetail("11");
        person1List.add(p3);
        Person1 p4 = new Person1();
        p4.setAge(1);
        p4.setName("11");
        p4.setDetail("11");
        person1List.add(p4);
        person1List.forEach(person2 -> {
            person2.setAge(1);
            person2.setName("aa");
            person2.setDetail("aa");
            System.out.println(person2);
        });
        /*
        * 我需要记录一下，
        * 这个forEach不能将没有进行任何add的list打印出来，即使我们在foreach方法体里set，这个foreach的作用是用set把原有的
        * 列表里的所有Person实例的各个属性改变，
        * 比如把person1的age,name,detail
        *       person1的age,name,detail的都改为一个值
        *
        * */
        System.out.println(person1List);

        Person1 p = new Person1();
        p.setAge(1);
        p.setName("11");
        p.setDetail("11");
        person1List.add(p);
        Person1 p2 = new Person1();
        p2.setAge(2);
        p2.setName("2");
        p2.setDetail("22");
        person1List.add(p2);
        person1List.forEach(p1 -> {
            System.out.println(p1.getAge());
            System.out.println(p1.getName());
            System.out.println(p1.getDetail());
        });

    }
}
class Person1{
    private int age;
    private String name;
    private String detail;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}