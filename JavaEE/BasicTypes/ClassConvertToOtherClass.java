package JavaEE.BasicTypes;

public class ClassConvertToOtherClass {
    public static void main(String[] args) {
        //字符串转换为int
        String s = "111";
        int i = Integer.parseInt(s);
        System.out.println(s+" "+i);
        Integer integer = Integer.valueOf(s);//会转换为Integer类型
        int i1 = Integer.valueOf(s).intValue();//转换为int类型
        System.out.println(integer);
        Integer integer1 = Integer.valueOf(s, 8);//后面这个index是规定了前面这个参数解析成int类型时用几进制
        System.out.println(integer1);
        //使用这两个方法换砖时，字符串也必须是数字字符，
        /*String s1 = "abc";
        Integer integer2 = Integer.valueOf(s1);//会报错
        System.out.println(integer2);*/


        //int转字符串
        int a = 12;
        String s2 = String.valueOf(a);
        System.out.println(s2);
        String s3 = a + "";
        System.out.println(s3);

        //字符转换为int
        char ch = '9';
        int i2 = Integer.parseInt(String.valueOf(ch));
        System.out.println(i2);

        int i3 = (int) ch - (int) '0';
        int i5 = (int)(ch - '0');
        System.out.println("i5:"+ i5);
        System.out.println(i3);

        char ch1 = 'a';
//        int i4 = Integer.parseInt(String.valueOf(ch1));//会报错，看来字符转int也必须是数字字符
//        System.out.println(i4);

        int i4 = ch1 + 1;
        System.out.println(i4);

        //Long转int
        Long l = 123L;
        int i6 = l.intValue();
        System.out.println(i6);

        int i7 = Math.toIntExact(l);
        System.out.println(i7);

        Long l1 = new Long(12);
        int i8 = (int) l1.longValue();
        System.out.println(i8);


    }
}
