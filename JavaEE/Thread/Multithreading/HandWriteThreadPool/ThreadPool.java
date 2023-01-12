package JavaEE.Thread.Multithreading.HandWriteThreadPool;

public interface ThreadPool {
    //提交任务到线程池
    void execute(Runnable runnable);
    //关闭
    void shutdown();
    //获取线程池初始化时的线程大小
    int getInitSize();
    //获取线程池最大线程数
    int getMaxSize();
    //获取线程池核心线程数量
    int getCoreSize();
    //获取活跃线程数量
    int getActiveCount();
    //获取线程池缓存队列大小
    int getQueueSize();
    //查看线程是否被销毁
    boolean isShutdown();

}
