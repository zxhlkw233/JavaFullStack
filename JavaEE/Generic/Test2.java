package JavaEE.Generic;

public class Test2 {

}
class Result<T>{
    private T data;

    public Result(T data) {
        this.data = data;
    }

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>(data);
        return result;
    }

}
