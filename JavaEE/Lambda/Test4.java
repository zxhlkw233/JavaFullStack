package JavaEE.Lambda;

import java.util.Locale;

public class Test4 {
    public static void main(String[] args) {
        AA a = new AA();
        String value = a.stringHandler("aaaaa", s -> s.toUpperCase(Locale.ROOT));
        String value1 = a.stringHandler("abcde", s -> s.substring(0,2));

        System.out.println(value);
        System.out.println(value1);
    }
}
interface MyFunction{
    public String getValue(String str);
}
class AA{
    public String stringHandler(String str,MyFunction myFunction){
        return myFunction.getValue(str);
    }
}