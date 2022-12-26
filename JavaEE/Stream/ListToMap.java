package JavaEE.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"2","3"));
        list.add(new Person(2,"3","4"));
        list.add(new Person(3,"4","5"));
        list.add(new Person(4,"5","6"));
        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(Person::getStnumber, Person::getName));
        System.out.println(collect);

    }
}
class Person{
    private int stnumber;
    private String name;
    private String detail;

    public Person(int stnumber, String name, String detail) {
        this.stnumber = stnumber;
        this.name = name;
        this.detail = detail;
    }

    public int getStnumber() {
        return stnumber;
    }

    public void setStnumber(int stnumber) {
        this.stnumber = stnumber;
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
}