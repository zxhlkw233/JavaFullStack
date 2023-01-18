package JavaEE.Thread.Lock;

import java.util.concurrent.TimeUnit;

//可重入锁
public class ReentTant_Lock {
    synchronized void m1(){
        System.out.println("m1 start");
        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        m2();
    }
    synchronized void m2(){
        try{
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
