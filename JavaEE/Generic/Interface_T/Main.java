package JavaEE.Generic.Interface_T;

 interface MyInterface {
    <T> T process(T value);
}

 class MyImplementation implements MyInterface {
    @Override
    public <T> T process(T value) {
        // 在此处编写具体的处理逻辑
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = new MyImplementation();

        String result1 = myInterface.process("Hello");
        Integer result2 = myInterface.process(10);

        System.out.println(result1);  // 输出: Hello
        System.out.println(result2);  // 输出: 10
    }
}

