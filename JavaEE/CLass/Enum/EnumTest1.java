package JavaEE.CLass.Enum;

public class EnumTest1 {
    public static void main(String[] args) {

    }
}

enum fun{
    FU("1");

    fun(String number) {

    }
}
enum MyEnum {
    VALUE1("First value"),
    VALUE2("Second value"),
    VALUE3("Third value");

    private final String description;

    MyEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
enum MyEnum1 {
    VALUE1("First value"),
    VALUE2("Second value"),
    VALUE3("Third value");

    private final String description;

    MyEnum1(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
