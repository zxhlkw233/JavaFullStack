package JavaEE.String;

import JavaEE.Reflect.User;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List<Users> userList = new ArrayList<>();
        userList.add(new Users(1L,"1",11));
        userList.add(new Users(2L,"2",22));
        userList.add(new Users(3L,"3",33));
        System.out.println("第一个方法" );
        userList.stream().filter(users -> users.getAges() > 18).forEach(System.out::println);
        System.out.println("第二个方法" );
        userList.stream().filter(users -> users.getAges() > 18).map(Users::getName).forEach(System.out::println);
        System.out.print("第三个方法 ");
        userList.stream().filter(users -> users.getAges() > 18).map(Users::getName).forEach(System.out::println);
    }
}
class Users{
    private long age;
    private String name;
    private int ages;

    public Users(long age, String name, int ages) {
        this.age = age;
        this.name = name;
        this.ages = ages;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }
}
