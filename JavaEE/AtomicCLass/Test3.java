package JavaEE.AtomicCLass;

import java.util.concurrent.atomic.AtomicInteger;

public class Test3 {
    public static void main(String[] args) {
        AtomicInteger firstJobDone = new AtomicInteger(0);
        System.out.println(firstJobDone);

        firstJobDone.incrementAndGet();

    }
}
