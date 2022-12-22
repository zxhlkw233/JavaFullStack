package JavaEE.Thread.NewThread;

public class ExtendsThread {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("我在学多线程" + i);
        }
    }
}
class TestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我在看代码--" + i);
        }
    }
}