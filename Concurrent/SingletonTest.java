package Concurrent;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonTest {
    public SingletonTest() {
    }

    static class SingletonJava8 {
        private SingletonJava8() {
        }

        private static volatile SingletonJava8 singletonJava8;

        public static SingletonJava8 getInstance() {
            // 判断对象是否已初始化
            if (singletonJava8 == null) {
                // 避免出现多个对象被创建，需要上锁
                synchronized (SingletonJava8.class) {
                    // 再次判断对象是否已被初始化，第一个进来的线程已经完成对象初始化了，之后的线程全部直接获取对象返回
                    if (singletonJava8 == null) {
                        // 查看成功创建对象的线程信息
                        System.out.println(Thread.currentThread());
                        // 创建对象
                        singletonJava8 = new SingletonJava8();
                    }
                }
            }
            return singletonJava8;
        }
    }

    public static void main(String[] args) {

    }

}
