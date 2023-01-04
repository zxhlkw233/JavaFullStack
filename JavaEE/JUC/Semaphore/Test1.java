package JavaEE.JUC.Semaphore;

import java.util.concurrent.Semaphore;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);
        System.out.println(semaphore);

        semaphore.acquire();
        System.out.println(semaphore);

        semaphore.acquire();
        System.out.println(semaphore);

        semaphore.acquire();
        System.out.println(semaphore);

        semaphore.acquire();
        System.out.println(semaphore);

    }
}
