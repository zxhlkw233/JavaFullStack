package JavaEE.Array;

public class CreateObjectArrays {
    public static void main(String[] args){
        //第一种方式
        person[] ps = new person[5];
        ps[0] = new person("1",2,"2");
        //第二种方式
        person[] ps1 = new person[]{
                new person("1",2,"1"),
                new person("2",1,"2")
        };
        //第三种方式
        person[] ps2 = {
                new person("1",2,"1"),
                new person("2",3,"1")
        };


    }
}
class person{
    private String name;
    private int age;
    private String sex;

    public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
