package JavaEE.Lambda;

interface Printable{
    void printString(String s);
}

public class Test3 {
    public static void main(String[] args) {
        A a = new A();
        //匿名函数
        a.userPrintable(new Printable() {
            @Override
            public void printString(String s) {
                System.out.println(s);
            }
        });
        //Lambda表达式
        a.userPrintable(s -> System.out.println(s));
        //方法引用
        a.userPrintable(System.out::println);

    }
}

class A {
    public void userPrintable(Printable p){
        p.printString("哈哈哈哈哈");
    }
}