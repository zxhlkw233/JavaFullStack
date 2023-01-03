package JavaEE.Lambda.Demand_Demo1;

public class Test1 {

    private static ThreadLocal<Object> seqNum = new ThreadLocal<Object>() {
        public Integer initialValue(){
            return 0;
        }
    };

    public int getNextNum(){
        seqNum.set((Integer) seqNum.get() + 1);
        return (Integer) seqNum.get();
    }

    public static void main(String[] args) {
        Test1 sn = new Test1();
        TestClient t1 = new TestClient(sn);
        TestClient t2 = new TestClient(sn);
        TestClient t3 = new TestClient(sn);
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}

class TestClient implements Runnable {

    private Test1 sn;

    public TestClient(Test1 sn) {
        this.sn = sn;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            //每个线程打出3个序列值
            System.out.println("Thread[" + Thread.currentThread().getName() + "] sn[" + sn.getNextNum() + "]");
        }
    }
}