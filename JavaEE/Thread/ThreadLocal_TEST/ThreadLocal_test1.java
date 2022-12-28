package JavaEE.Thread.ThreadLocal_TEST;

public class ThreadLocal_test1 {
    private static ThreadLocal<ThreadLocal_test1> maps = new ThreadLocal<ThreadLocal_test1>();

    private String type;

    public ThreadLocal_test1() {
    }
    public static ThreadLocal_test1 getInstance(){
        ThreadLocal_test1 instance = maps.get();
        if(instance == null){
            instance = new ThreadLocal_test1();
            maps.set(instance);
        }
        return instance;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
}
