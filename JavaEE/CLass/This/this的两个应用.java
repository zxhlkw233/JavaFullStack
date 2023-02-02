package JavaEE.CLass.This;

public class this的两个应用 {
    //应用一：引用成员变量
    class Student {
        String name; //定义一个成员变量name
        private void SetName(String name) { //定义一个参数(局部变量)name
            this.name=name; //将局部变量的值传递给成员变量
        }
    }

    //应用二：调用类的构造方法
     class Student1 { //定义一个类，类的名字为student。
        public Student1() { //定义一个方法，名字与类相同故为构造方法
            this("Hello!");
        }
        public Student1(String name) { //定义一个带形式参数的构造方法
        }
    }
}
