package JavaEE.Thread.NewThread;

import java.util.concurrent.*;

public class ImplentsCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestRunnable testRunnable1 = new TestRunnable();
        TestRunnable testRunnable2 = new TestRunnable();
        TestRunnable testRunnable3 = new TestRunnable();

        //创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> result1 = (Future<Boolean>) executorService.submit(testRunnable1);
        Future<Boolean> result2 = (Future<Boolean>) executorService.submit(testRunnable2);
        Future<Boolean> result3 = (Future<Boolean>) executorService.submit(testRunnable3);

        //获取结果
        Boolean r1 = result1.get();
        Boolean r2 = result1.get();
        Boolean r3 = result1.get();

        //关闭服务
        executorService.shutdownNow();

        /*
        *
        *
        * 继承Thread类
            子类继承Thread类
            启动线程：子类对象.start()
            **不建议使用：**避免OOP单继承局限性
            实现Runnable接口
            实现runnable接口具有多线程能力
            启动线程：传入目标对象+Thread对象.start（）
            **推荐使用：**避免单继承局限性，灵活方便，方便同一个对象被多个线程使用
        * */

    }
}

class TestCallable implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "在上班" + i);
        }
        return Boolean.TRUE;
    }

}