package JavaEE.CLass.This;

public class Demo1 {
    public static void main(String[] args) {
        a a1 = new a();
        a1.printName();
    }

}

class a{
    private String name;

    public void printName(){
        String name="local name";
        this.name = "111";
        System.out.println("local variable value  is "+name+"name belongs to Object "+this.name);
    }
}