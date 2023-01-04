package JavaEE.Generic;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public <T> void set (T a){

    }
    public static void main(String[] args) {
        Test11 test11 = new Test11();
        test11.set("");
        test11.set(1);
        List<String> list = new ArrayList<>();
        test11.set(list);
    }

}
