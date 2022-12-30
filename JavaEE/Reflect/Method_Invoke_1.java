package JavaEE.Reflect;

import java.lang.reflect.Method;

public class Method_Invoke_1 {

    public static void main(String[] args) throws Exception {
        Method animalMethod = Animal.class.getDeclaredMethod("print");
        Method catMethod = Cat.class.getDeclaredMethod("print");
        System.out.println("--------------1---------------");
        Animal animal = new Animal();
        Cat cat = new Cat();
        animalMethod.invoke(cat);
        animalMethod.invoke(animal);

        System.out.println("--------------2---------------");
        catMethod.invoke(cat);
        catMethod.invoke(animal);
    }

}

class Animal {

    public void print() {
        System.out.println("Animal.print()");
    }

}

class Cat extends Animal {

    @Override
    public void print() {
        System.out.println("Cat.print()");
    }

}