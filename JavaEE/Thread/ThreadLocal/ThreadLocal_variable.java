package JavaEE.Thread.ThreadLocal;

public class ThreadLocal_variable {
    public static void main(String[] args) {
        ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();
        String s = "aa";
        stringThreadLocal.set(s);
        String s1 = stringThreadLocal.get();
        System.out.println(s1);
    }
}
