package JavaEE.Thread.NewThread;

public class ImplentsRunnable {
    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        new Thread(testRunnable).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("学习" + i);
        }
    }
}
class TestRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程" + i);
        }
    }
}