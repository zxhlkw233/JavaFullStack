package JavaEE.Lambda.MethodReferences.Demo1;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    Person[] person = new Person[]{
            new Person("003", LocalDate.of(2016, 9, 1)),
            new Person("001", LocalDate.of(2016, 2, 1)),
            new Person("002", LocalDate.of(2016, 3, 1)),
            new Person("004", LocalDate.of(2016, 12, 1))};

    @Test
    //使用匿名类
    public void main1(){
        Arrays.sort(person,new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println(Arrays.asList(person));
    }

    //使用Lambda表达式，未调用已存在的方法
    @Test
    public void main2(){
        Arrays.sort(person,(Person a,Person b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });
        System.out.println(Arrays.asList(person));
    }

    //使用Lambda表达式，调用已存在的方法
    @Test
    public void main3(){
        Arrays.sort(person,(a,b) -> Person.compareByAge(a,b));
    }
    //使用方法引用
    @Test
    public void mian4(){
        Arrays.sort(person,Person::compareByAge);
        System.out.println(Arrays.asList(person));
    }
}

