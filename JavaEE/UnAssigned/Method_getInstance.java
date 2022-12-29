package JavaEE.UnAssigned;

public class Method_getInstance {
    public static void main(String[] args) {

    }
    private static Method_getInstance instance = new Method_getInstance();
    public static Method_getInstance getInstance(){
        System.out.println(instance);
        return instance;
    }
}
