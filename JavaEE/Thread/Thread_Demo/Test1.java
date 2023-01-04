package JavaEE.Thread.Thread_Demo;

public class Test1 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Thread t1 = new Thread(test2);
        Thread t2 = new Thread(test2);
        Thread t3 = new Thread(test2);
        t1.start();
        t2.start();
        t3.start();
    }
}
class Test2 implements Runnable{

    private int tick = 100;

    @Override
    public void run() {
        while(true){
            if(tick > 0){
                System.out.println("...sale" + tick--);
            }
        }
    }
}
