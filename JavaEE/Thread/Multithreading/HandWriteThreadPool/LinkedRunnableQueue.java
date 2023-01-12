package JavaEE.Thread.Multithreading.HandWriteThreadPool;

import java.util.LinkedList;

/**
 * @param * @param null
 * @author zhangxiaohu
 * @date 2023/1/12 17:47
 * @return
    缓存队列
 * 使用了linkedList作为队列，进队的offer方法要判断队列是否满，没有满则加入队列并唤醒，出队只需要判断队列是否为空，如果为空就阻塞等待
 *
 * 这里也可以使用自己写的Queue方法，同样具有进队出队功能，最后会把代码放上
 */
public class LinkedRunnableQueue implements RunnableQueue{
    //任务队列的最大容器
    private final int limit;

    //容器最大时，需要使用的拒绝策略
    private final DenyPolicy denyPolicy;

    //存放队列
    private final LinkedList<Runnable> runnableLinkedList;
    private final ThreadPool threadPool;

    public LinkedRunnableQueue(int limit,DenyPolicy denyPolicy,ThreadPool threadPool){
        this.limit = limit;
        this.denyPolicy = denyPolicy;
        this.threadPool = threadPool;
        runnableLinkedList = new LinkedList<>();
    }

    @Override
    public void offer(Runnable runnable) {
        synchronized (runnableLinkedList){
            //如果缓存数量超过最大值，则使用拒绝策略
            if(runnableLinkedList.size() >= limit){
                denyPolicy.reject(runnable,threadPool);
            }else {
                //成功加入list的末尾,并唤醒阻塞中的线程
                runnableLinkedList.addLast(runnable);
                runnableLinkedList.notify();
            }
        }
    }

    @Override
    public Runnable take() {
        //如果缓存队列为空，则挂起，等待新的任务https://zhuanlan.zhihu.com/p/62394330
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
