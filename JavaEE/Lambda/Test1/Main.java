package JavaEE.Lambda.Test1;

public class Main {
    public static void main(String[] args) {
        useLambdaDemo(()->{
            System.out.println("1");
        });
        add1((int x,int y,int z)->{
            return x + y + z;
        });
        useFun((String s)->{
            System.out.println(s);
        });
        //参数的类型可以省略
        useFun((s)-> {
            System.out.println(s);
        });
        //单个参数可以省略括号
        useFun(s-> {
            System.out.println(s);
        });
        //代码块中单个语句可以省略大括号
        useFun(s-> System.out.println(s));

    }
    private static void useLambdaDemo(LambdaDemo la){
        la.print();
    }
    private static void add1(AddDemo addDemo){
        int num = addDemo.add(1,2,3);
        System.out.println("结果是："+num);
    }
    private static void useFun(UseDemo useDemo){
        useDemo.fun("省略");
    }
}
