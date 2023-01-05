package JavaEE.Thread.Synchronized;

public class LockObject {
    String str = new String("lock");
    public void obj() {
        synchronized (str) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void obj1() {
        String str = new String("lock");
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void obj2() {
        String str = new String("lock");
        synchronized (str) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        LockObject lockObject = new LockObject();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lockObject.obj2();
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lockObject.obj2();
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lockObject.obj1();
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lockObject.obj1();
//            }
//        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lockObject.obj();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lockObject.obj();
            }
        }).start();
    }
}
