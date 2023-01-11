package JavaEE.Lambda.MethodReferences.Demo1;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthday;
    public Person(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public static int compareByAge(Person a,Person b){
        return a.birthday.compareTo(b.birthday);
    }
    public String toString(){
        return this.name;
    }
}
