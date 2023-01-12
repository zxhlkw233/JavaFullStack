package JavaEE.Thread.Multithreading.Multithreading_exercise;

class Account {
    private int balance;
    boolean flag = true;

    public void deposit(int op) {
        for (int i = 0; i < 3; i++) {
            synchronized (this) {
                if (flag) {
                    try {
                        flag = false;
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //这俩效果一样
//                if (flag)
//                    try {
//                        flag = false;
//                        this.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//
                balance += op;
                System.out.println(Thread.currentThread().getName() + ":" + balance);
                flag = true;
                this.notify();

            }
        }
    }
}

public class Customer extends Thread {
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(1000);
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        Customer c1 = new Customer(account1);
        Customer c2 = new Customer(account1);
        c1.setName("first");
        c2.setName("second");
        c1.start();
        c2.start();

    }
}
