package JavaEE.Lambda;

public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了")).start();
    }

}
