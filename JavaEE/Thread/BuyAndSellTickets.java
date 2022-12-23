package JavaEE.Thread;

import java.util.concurrent.locks.ReentrantLock;

public class BuyAndSellTickets {
    public static void main(String[] args) {
        buyTickets person = new buyTickets();
        Thread t = new Thread(person);
        t.start();
        t = new Thread(person);
        t.start();
        t = new Thread(person);
        t.start();
    }
}
class buyTickets implements Runnable{
    private final ReentrantLock locks = new ReentrantLock();
    int ticket = 10;
    @Override
    public void run() {
        while(true){
            try{
                locks.lock();
                if(ticket > 0){
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(ticket--);
                }else{
                    System.out.println("你买的票已经被购完了");
                }
            }finally {
                locks.unlock();
            }
        }
    }


}
