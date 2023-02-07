package JavaEE.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 线程池 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new MyThread1());
        service.execute(new MyThread1());
        service.execute(new MyThread1());
        service.execute(new MyThread1());
    }
}
class MyThread1 implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
