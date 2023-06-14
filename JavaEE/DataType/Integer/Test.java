package JavaEE.DataType.Integer;

public class Test {
    public static void main(String[] args) {
        Integer a = Integer.decode("1111111111");
        System.out.println(a);

        int compare = Integer.compare(1, 2);
        System.out.println(compare);

        int i = Integer.compareUnsigned(-10, 2);
        System.out.println(i);

        int i1 = Integer.divideUnsigned(-10, 2);
        System.out.println(i1);
        int i2 = Integer.divideUnsigned(10, -2);
        System.out.println(i1);

        Integer integer = Integer.getInteger("1");
        System.out.println(integer);

        Integer integer1 = Integer.getInteger("1", 11111);
        System.out.println(integer1);

        int i3 = Integer.hashCode(1);
        System.out.println(i3);


        int i4 = Integer.parseInt("1111111");
        System.out.println(i4);

        int i5 = Integer.numberOfLeadingZeros(10);
        System.out.println(i5);

        String string = Integer.toString(10);
        System.out.println(string);

        Integer integer2 = Integer.valueOf(10);

        Integer ff = Integer.valueOf("FF", 16);
        System.out.println(ff);
    }
}
