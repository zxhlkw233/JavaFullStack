package JavaEE.Generic.GenericClass;

public class MainTest {
    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>();
        GenericClass<String> genericClass1 = new GenericClass<>();
        genericClass.setName(1);
        genericClass1.setAge(1);
        genericClass1.setName("1");
        genericClass.setAge(1);
    }
}
