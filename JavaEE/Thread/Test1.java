package JavaEE.Thread;

public class Test1 {
    public static void main(String[] args) {
        // 获取当前线程对象
        Thread currentThread = Thread.currentThread();

        // 打印当前线程的名称
        System.out.println("当前线程名称：" + currentThread.getName());


        currentThread.getContextClassLoader();
        currentThread.getName();


        // 执行线程相关操作
        currentThread.setPriority(Thread.MAX_PRIORITY);
        currentThread.interrupt();
        // ...
    }
}
