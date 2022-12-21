package JavaEE.Construct;

public class ConstructAndStatic {
    public static void main(String[] args) {
        fun a = new fun();
        fun.print();
    }
}
class fun{
    public static void print(){
        System.out.println("静态方法打印");
    }

    public fun() {
        System.out.println("构造方法打印");
    }
}