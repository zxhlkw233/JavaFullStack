package JavaEE.Generic.T;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        //获取string类型
        List<String> array = new ArrayList<String>();
        array.add("test");
        array.add("doub");
        String str = demo.getListFisrt(array);
        System.out.println(str);

        //获取nums类型
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(13);

        Integer num = demo.getListFisrt(nums);
        System.out.println(num);
    }

    /**
     * 这个<T> T 可以传入任何类型的List
     * 参数T
     *     第一个 表示是泛型
     *     第二个 表示返回的是T类型的数据
     *     第三个 限制参数类型为T
     * @param data
     * @return
     */
    /*
    * 传入 T(第三个T)类型,返回T(第二个T)类型
    * */
    private <T> T getListFisrt(List<T> data) {
        if (data == null || data.size() == 0) {
            return null;
        }
        return data.get(0);
    }
    private <T> String getListFisrt1(List<String> data) {
        if (data == null || data.size() == 0) {
            return null;
        }
        return data.get(0);
    }


}
class Pair<T> {
    private T first;
    private T second;

    public Pair(){}
    public Pair(T first,T second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first){
        this.first = first;
    }
    public T getFirst(){
        return first;
    }
    public void setSecond(T second){
        this.second = second;
    }
    public T getSecond(){
        return second;
    }
}
/*
* 其实即使定义了<T>也可以不使用 T定义成员变量
* */
class Pair1<T> {
    private String a;
    private String b;
}
/*不在class出定义<T> 而直接使用，是错误的
class Pair2{
    private T a;
}*/
/*这样也是错误的
class Pair3 T{
    private T a;
}*/
class Pair4 <T>{
    private T a;
}
/*
这样子是错误的
class Pair4_1 <T> T{
    private T a;
}*/
class Pair5{
    private <T> T fun(String a){
        System.out.println("1");
        return (T) a;
    }
}