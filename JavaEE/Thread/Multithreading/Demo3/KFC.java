package JavaEE.Thread.Multithreading.Demo3;

import java.util.ArrayList;
import java.util.List;

public class KFC {
    //食物的种类
    String[] names = {"薯条","烧饭","鸡翅","可乐"};
    //生产的最大值，到达后可以休息
    static final int Max = 20;
    //存放食物的集合
    List foods = new ArrayList();
    //生产食物的方法
    public void prod(int index){
        synchronized (this){
            //如果食物数量大于20
            while(foods.size() > Max){
                System.out.println("食物够了");
                this.notify();
                String name = Thread.currentThread().getName();
                //currentThread()方法返回正在被执行的线程的信息。
                System.out.println("生产者: " + name);
            }
            //开始生产食物
            System.out.println("开始生产食物");
            for (int i = 0; i < index; i++) {
                Food food = new Food(names[(int)(Math.random() * 4)]);
                foods.add(food);
                System.out.println("生产了" + food.getName() + foods.size());
            }
        }
    }
}
