package JavaEE.Lambda.Demand_Demo2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//线程安全
public class TopicDao_Thread_Safety {
    //使用ThreadLocal保存Connection变量
    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();
    public static Connection getConnection(){
        //如果connThreadLocal没有本线程对应的Connection创建一个新的Connection,并将其保存到线程本地变量中
        return connectionThreadLocal.get();
    }
    public void addTopic() throws SQLException {
        //从ThreadLocal中获取线程对应的Connection
        Statement statement = getConnection().createStatement();
    }
}
