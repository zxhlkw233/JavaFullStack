package JavaEE.CLass;

public class Test1 {
    public static void main(String[] args) {
        c c1 = new c();
        c1.sun();
    }
}
abstract class a{

    abstract void a();

    public void fun(){
        System.out.println("a抽象类");
    }
}

abstract class b extends a{
    public void fun(){
        System.out.println("b抽象类");
    }
}
class c extends b{
    public void sun(){
        System.out.println("c类");
    }

    @Override
    void a() {

    }
}

interface d{
    public void a();
}