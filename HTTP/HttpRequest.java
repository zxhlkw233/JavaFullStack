package HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String method;
    private String url;
    private String version;
    private Map<String,String> headers = new HashMap<>();
    private Map<String,String> parameters = new HashMap<>();

    //请求的构造逻辑，也是用工厂模式来构造
    //此处的参数，就是从socket中获取到的InputStream对象
    //这个过程本质上就是再“反序列化”

    public static HttpRequest build(InputStream inputStream) throws IOException {
        HttpRequest request = new HttpRequest();
        //此处的逻辑中，不能把bufferedReader 写到try中
        //一旦写进去之后就意味着bufferReader 就会被关闭，会影响到clientSocket的状态
        //等到最后整个请求处理完了，再同一关闭
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //1.此处的build的过程就是解析请求的过程
        //1.解析首行
        String firstLine = bufferedReader.readLine();
        String[] firstLineTokens = firstLine.split(" ");
        request.method = firstLineTokens[0];
        request.url = firstLineTokens[1];
        request.version = firstLineTokens[2];
        //2.解析url中的参数
        int pos = request.url.indexOf("?");
        //if()https://www.jb51.net/article/240415.htm
        return null;
    }

}
