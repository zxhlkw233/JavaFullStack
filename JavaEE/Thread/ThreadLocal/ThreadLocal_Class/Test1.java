package JavaEE.Thread.ThreadLocal.ThreadLocal_Class;

public class Test1 {
    public static void main(String[] args) {
        ThreadLocal<Person> personThreadLocal = new ThreadLocal<>();
        Person person = new Person();
        person.setAge(1);
        person.setName("2");
        person.setDetail("3");
        personThreadLocal.set(person);
        Person person1 = personThreadLocal.get();
        System.out.println(person1);
    }
}
class Person{
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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
