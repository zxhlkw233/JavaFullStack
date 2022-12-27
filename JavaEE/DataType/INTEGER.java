package JavaEE.DataType;

public class INTEGER {
    public static void main(String[] args) {
        Integer a1 = 12;
        Integer a2 = 12;
        System.out.println(a1 == a2);//true
        Integer a3 = new Integer(13);
        Integer a4 = new Integer(13);
        System.out.println(a3 == a4);//false
        Integer b1 = 2000;
        Integer b2 = 2000;
        System.out.println(b1 == b2);//false
        Integer c1 = 127;
        Integer c2 = 127;
        System.out.println(c1 == c2);//true 超过 -128 - 127 就不对了
    }
}
