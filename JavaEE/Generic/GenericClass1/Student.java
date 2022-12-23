package JavaEE.Generic.GenericClass1;

public class Student {
    private int d;
    private int e;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Student{" +
                "d=" + d +
                ", e=" + e +
                '}';
    }
}
