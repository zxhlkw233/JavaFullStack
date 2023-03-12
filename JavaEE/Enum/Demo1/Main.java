package JavaEE.Enum.Demo1;

public class Main {
    public static void main(String[] args) {
//        Color color = Color.BLUE;
//        System.out.println(color);
        for (Color1 value : Color1.values()) {
            System.out.println(value);
        }
    }
}
enum Color1{
    RED("红色"),GREEN("绿色"),BLUE("蓝色");
    private Color1 (String name){
        this.setName(name);
    }
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}