package JavaEE.Reflect;

public class User {
    private String name;
    private int age;
    private String sex;
    private String address;

    public String zxh;

    public String getZxh() {
        return zxh;
    }

    public void setZxh(String zxh) {
        this.zxh = zxh;
    }

    private void method1(){
        System.out.println("method1打印了");
    }
    private void method2(String name){
        System.out.println("method2打印了："+name);
    }
    private int method3(int age){
        System.out.println("method3打印了："+age);
        return age;
    }
    public void method4(){
        System.out.println("method4打印了");
    }

    public User() {
    }

    public User(String name, int age, String sex, String address, String zxh) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.zxh = zxh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
