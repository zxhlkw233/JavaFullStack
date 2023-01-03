package JavaEE.Lambda.Demand_Demo2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//非线程安全
public class TopicDao_Thread_UnSafety {
    private Connection connection; //一个非线程安全的变量
    public void addTopic() throws SQLException {
        Statement statement = connection.createStatement(); //引用非线程安全变量

    }
}
