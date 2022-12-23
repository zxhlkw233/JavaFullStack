package JavaEE.String;

public class StringCoparison {


    public static void main(String[] args) {
        String s = "abc";
        String s1 = "abc";
        System.out.println(s == s1);//true

        String c = new String("aaa");
        String c1 = new String("aaa");
        System.out.println(c == c1);

        System.out.println(s.equals(s1));//true
    }
}
