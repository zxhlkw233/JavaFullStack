package JavaEE.Thread;

/**
 * @author zhangxiaohu
 * @date 2023/1/18 15:55
 * @param * @param null
 * @return
注：不要用字符串常量作为锁定对象，因为这样其实锁定的是同一个对象。
这种情况还会发生比较诡异的现象，比如你用到了一个类库，在该类库中代码锁定了字符串“Hello”，
但是你读不到源码，所以你在自己的代码中也锁定了"Hello",这时候就有可能发生非常诡异的死锁阻塞，
因为你的程序和你用到的类库不经意间使用了同一把锁。
 *
 */

public class 同步和非同步方法同时调用 {
    public synchronized void m1() {
        System.out.println(Thread.currentThread().getName() + " m1 start...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " m1 end");
    }

    public void m2() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " m2 ");
    }

    public static void main(String[] args) {
        同步和非同步方法同时调用 t = new 同步和非同步方法同时调用();

		/*new Thread(()->t.m1(), "t1").start();
		new Thread(()->t.m2(), "t2").start();*/

        new Thread(t::m1, "t1").start();
        new Thread(t::m2, "t2").start();

		/*
		new Thread(new Runnable() {

			@Override
			public void run() {
				t.m1();
			}

		});
		*/
    }
}
