package JavaEE.Generic.Thewildcard;

public class FoodTest <T extends Fruits>{
    private T prem;

    public T getPrem() {
        return prem;
    }

    public void setPrem(T prem) {
        this.prem = prem;
    }

    private int age;
    private String name;

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
        return "FoodTest{" +
                "prem=" + prem +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class FoodTest1 <Fruits>{
    private int age;
    private String name;

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
}