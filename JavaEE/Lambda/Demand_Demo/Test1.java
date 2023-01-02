package JavaEE.Lambda.Demand_Demo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test1 {

    public static void main(String[] args) {
         List<Employee> employeeList = Arrays.asList(
                new Employee("张三", 18, 9999.99),
                new Employee("李四", 38, 5555.55),
                new Employee("王五", 60, 6666.66),
                new Employee("赵六", 8, 7777.77),
                new Employee("田七", 58, 3333.33)
        );
        Collections.sort(employeeList,(e1,e2) ->{
            if(e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }
            return Integer.compare(e1.getAge(),e2.getAge());
        });
        employeeList.stream().forEach(System.out::println);
    }
}
class Employee implements Serializable{
    private static final long serialVersionUID = -9079722457749166858L;
    private String name;
    private Integer age;
    private Double salary;

    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
