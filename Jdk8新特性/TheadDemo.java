package Jdk8新特性;

public class TheadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        Thread.State state = thread.getState();
        System.out.println(state);
        thread.start();
        System.out.println(state);
        thread.wait();
        System.out.println(state);

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread");
    }
}
