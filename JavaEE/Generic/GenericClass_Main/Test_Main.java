package JavaEE.Generic.GenericClass_Main;

public class Test_Main {
    public static void main(String[] args) {

        /*
        * 上边界通配符
        * 符合要求，可设置Woman的父类，Woman以及Person类
        * */
        Data<? super Woman> data = new Data<>();

        /*
        * 符合要求，可设置Person类
        * */
        Data<? super Person> data1 = new Data<>();

        /*
        * 不符合要求，Animal 是最顶层的类，其取值都不符合<T extends Person> 要求
        * */
//        Data<? super Animal> data2 = new Data<Animal>(); //报错

        Data<? extends Animal> data3 = new Data<>();
    }
}
