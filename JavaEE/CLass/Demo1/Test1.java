package JavaEE.CLass.Demo1;

public class Test1 {
    /*
    * 是怎么模拟的呢，user_person类里创建person实例，然后在主方法中调用这个实例
    * */
    public static void main(String[] args) {
        User_Person user_person = new User_Person();
        Person person = user_person.person;
    }
}
