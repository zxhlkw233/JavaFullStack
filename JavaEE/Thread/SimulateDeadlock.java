package JavaEE.Thread;

/**
 * @ClassName TestVolatile
 * @Description: Thread 已经修改了flag，但是main线程还是拿到的false
 * @Author: WangWenpeng
 * @Version 1.0
 */
public class SimulateDeadlock {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();
        while (true) {
            if (td.isFlag()) {
                System.out.println("______________");
                break;
            }
        }
    }
}

class ThreadDemo implements Runnable {
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            //增加这种出现问题的几率
            Thread.sleep(200);
        } catch (Exception e) {
        }
        flag = true;
        System.out.println("flag=" + isFlag());
    }
}

