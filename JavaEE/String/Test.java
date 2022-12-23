package JavaEE.String;

public class Test {
    public static void main(String[] args) {
        String s = "ab cdabcg efghi jklmn abcd abab";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("abcg"));
        System.out.println(s.indexOf("a",1));
        System.out.println(s.lastIndexOf("n")); //这个显示的 不是相对倒数而来的 1，2，3，而还是正数来的1，2，3
        System.out.println(s.contains("aa")); //判断是否存在字符串
        System.out.println(s.concat("aa")); //在字符串末尾添加字符,但这样是没法永久保持的，因为每使用一次concat都会创建一个对象
        String aa = s.concat("aa");//这样才是永久的，sb就不会，
        System.out.println(aa);
        String[] s1 = s.split(" ");
        System.out.println(s);
        System.out.println(s.endsWith("abc"));
        System.out.println(s.startsWith("aa"));
        System.out.println(s.compareTo("a你"));
        char[] chars = s.toCharArray();
        System.out.println(chars);
//        System.out.println(s.replace('a','z'));
        System.out.println(s.replaceFirst("ab","11"));
        System.out.println(s.replaceAll("ab","11"));

        StringBuffer sb = new StringBuffer(s);

        System.out.println(s.substring(2));
        System.out.println(s.toLowerCase());

    }
}
