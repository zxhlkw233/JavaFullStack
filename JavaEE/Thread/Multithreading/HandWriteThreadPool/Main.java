package JavaEE.Thread.Multithreading.HandWriteThreadPool;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        final ThreadPool threadPool = new BasicThreadPool(2,6,4,100);
        for (int i = 0; i < 20; i++) {
            threadPool.execute(() -> {
                try{
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "开始了");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            });
        }

    }
}
