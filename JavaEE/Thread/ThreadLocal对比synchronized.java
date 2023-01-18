package JavaEE.Thread;

import java.util.concurrent.TimeUnit;

/**
 * @author zhangxiaohu
 * @date 2023/1/18 16:12
 * @param * @param null
 * @return
 *ThreadLocal是线程局部变量
 *
 * ThreadLocal是使用空间换时间，synchronized是使用时间换空间
 */

public class ThreadLocal对比synchronized {
    //volatile static Person p = new Person();
    static ThreadLocal<Person> tl = new ThreadLocal<>();

    public static void main(String[] args) {

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(tl.get());
        }).start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tl.set(new Person());
        }).start();
    }

    static class Person {
        String name = "zhangsan";
    }
}
