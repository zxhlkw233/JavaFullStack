package JavaEE.Generic.Thewildcard;

public class MainTest {
    public static void main(String[] args) {
        FoodTest<Fruits> foodTest = new FoodTest<Fruits>();
        /*
        * 如果只是 想这样操作：FoodTest<Fruits> foodTest ，我感觉用不到上界通配符：public class FoodTest <T extends Fruits>
        *
        * */
        Fruits fruits = new Fruits();
        fruits.setName("1");
        fruits.setColor("red");

        foodTest.setName("1");
        foodTest.setAge(1);
        foodTest.setPrem(fruits);
        Fruits prem = foodTest.getPrem();
        /*
        * 为什么返回的是：JavaEE.Generic.Thewildcard.Fruits@4554617c
        * 我预想的输出：{name:1,age:1} 这样的封装结果集
        * */
        System.out.println("foodTest:"+foodTest);
        //对照
        FoodTest1<Fruits> foodTest1 = new FoodTest1<>();
        foodTest1.setName("1");
    }
}
