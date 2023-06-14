package JavaEE.Annotation.Demo1;

import java.lang.reflect.Field;

public class MyMain {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Class<?> clazz = obj.getClass();
        Field field;
        try {
            field = clazz.getDeclaredField("myField");
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
                String name = annotation.name();
                int age = annotation.age();
                System.out.println("name: " + name);
                System.out.println("age: " + age);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
class MyClass extends fun{
    @MyAnnotation(name = "Alice", age = 25)
    private String myField;

  public void ss(){
      sun();
  }
}


class fun{
    protected void sun(){
        System.out.printf("");
    }
}
