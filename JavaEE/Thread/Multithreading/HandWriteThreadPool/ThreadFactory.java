package JavaEE.Thread.Multithreading.HandWriteThreadPool;

@FunctionalInterface
//创建线程的工厂
//@FunctionalInterface 就是用来指定某个接口必须是函数式接口，所以 @FunInterface 只能修饰接口，不能修饰其它程序元素。
//函数式接口就是为 Java 8 的 Lambda 表达式准备的，Java 8 允许使用 Lambda 表达式创建函数式接口的实例，因此 Java 8 专门增加了 @FunctionalInterface。
public interface ThreadFactory {
    Thread creatThread(Runnable runnable);
}
