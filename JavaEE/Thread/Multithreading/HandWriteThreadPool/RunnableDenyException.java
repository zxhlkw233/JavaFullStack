package JavaEE.Thread.Multithreading.HandWriteThreadPool;

public class RunnableDenyException extends RuntimeException{
    public RunnableDenyException(String msg){
        super(msg);
    }
}
