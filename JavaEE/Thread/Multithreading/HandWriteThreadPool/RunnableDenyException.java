package JavaEE.Thread.Multithreading.HandWriteThreadPool;

//自定义异常
public class RunnableDenyException extends RuntimeException{
    public RunnableDenyException(String msg){
        super(msg);
    }
}
