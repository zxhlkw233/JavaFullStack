package JavaEE.Stream.Collect.Demo1;

public class Person {
    private int id;
    private String name;
    private String detail;

    public Person(int id, String name, String detail) {
        this.id = id;
        this.name = name;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
