package JavaEE.Thread.Multithreading.Demo1;

public class ThreadPool {
    private static int add = 0;

    public static void main(String[] args) throws InterruptedException {
        MyThreadPool pool = new MyThreadPool(10);
        for (int i = 0; i < 100; i++) {
            pool.submit(() -> System.out.println("开始执行 " + add));
            add++;
            Thread.sleep(500);
        }

    }
}
