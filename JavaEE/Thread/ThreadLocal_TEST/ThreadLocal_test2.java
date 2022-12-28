package JavaEE.Thread.ThreadLocal_TEST;

public class ThreadLocal_test2 {
    private static ThreadLocal<String> local = new ThreadLocal<String>();

    static void print(String str){
        System.out.println(str + ": "+local.get());
        local.remove();
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocal_test2.local.set("xdlcass_A");
                print("A");
                System.out.println("清除后: " + local.get());
            }
        },"A").start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocal_test2.local.set("xdclass_B");
                print("B");
                System.out.println("清除后 " +local.get());
            }
        },"B").start();
    }

}
