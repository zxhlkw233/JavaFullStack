package JavaEE.Thread;

//线程间的通讯-------生产者消费
/*
 * 对于多个生产者和消费者
 * 定义while判断标记：让被唤醒的线程再一次判断标记
 * 定义notifyAll()：使用notify，容易出现只唤醒本方线程的情况，导致所有线程都等待
 * */
public class ThreadCommunication {
    public static void main(String[] args) {
        Resource r = new Resource();

        Producer pro = new Producer(r);
        Consumer1 con = new Consumer1(r);

        new Thread(pro).start();
        new Thread(pro).start();
        new Thread(con).start();
        new Thread(con).start(); //--------两个输入线程，两个输出线程
    }
}

class Resource//---资源
{
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name) {
        while (flag)//--------------while次线程被唤醒都进行判断
            try {
                wait();
            } catch (Exception e) {
            }
        this.name = name + "--" + count++;
        System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
        flag = true;
        this.notifyAll();//------------线程全部唤醒
    }

    public synchronized void out() {
        while (!flag)//--------------while每次线程被唤醒都进行判断
            try {
                wait();
            } catch (Exception e) {
            }
        System.out.println(Thread.currentThread().getName() + "...消费者.。.." + this.name);
        flag = false;
        this.notifyAll();
    }
}

class Producer implements Runnable//--生产者
{
    private Resource res;

    Producer(Resource res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            res.set("+商品+");
        }
    }
}

class Consumer1 implements Runnable//--消费者
{
    private Resource res;

    Consumer1(Resource res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            res.out();
        }
    }
}

