package JavaEE.Thread;

public class BuyTickets {
    public static void main(String[] args) {
        Syncontainer syncontainer =  new Syncontainer();
        new Productor(syncontainer).start();
        new Consumer(syncontainer).start();
    }
}
//生产者
class Productor extends Thread{
    Syncontainer syncontainer;
    public Productor(Syncontainer syncontainer){
        this.syncontainer = syncontainer;
    }
    //生产
    public void run(){
        for(int i = 0;i < 10;i++){
            try{
                syncontainer.push(new Chicken((i)));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("生产了" + (i + 1) + "只鸡");
        }
    }
}
//消费者
class Consumer extends Thread{
    Syncontainer syncontainer;

    public Consumer(Syncontainer syncontainer) {
        this.syncontainer = syncontainer;
    }
    //消费


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                System.out.println("消费了->" + syncontainer.pop().id + "只鸡");
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


//产品
class Chicken{
    int id;
    Chicken(int id){
        this.id = id;
    }
}

//缓冲区
class Syncontainer{
    //需要一个容器大小
    Chicken[] chickens = new Chicken[10];
    int count = 0;
    //生产者放入产品
    public synchronized void push(Chicken chicken) throws InterruptedException {
        //如果容器满了，需要消费者消费
        if(count == chickens.length){
            this.wait();
        }
        //如果没有满，就需要生产产品放入
        chickens[count] = chicken;
        count++;
        //可以通知消费者了
        this.notifyAll();
    }
    //消费者消费产品
    public synchronized Chicken pop() throws InterruptedException{
        //判断缓冲区是否还有产品
        if(count == 0){
            this.wait();
        }
        count--;
        return chickens[count];
    }

}