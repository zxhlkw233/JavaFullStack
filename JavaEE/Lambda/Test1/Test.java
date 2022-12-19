package JavaEE.Lambda.Test1;

public class Test {
    public static void main(String[] args) {
        //http://www.tup.tsinghua.edu.cn/upload/books/yz/069916-01.pdf,这个课件还可以
        myInter add = (m,n) ->m+n;
        System.out.println("求和: "+add.compute(1,2));

        myInter subtract = (m,n) ->m - n;
        System.out.println();

    }
}
interface myInter{
    double compute(double x,double y);
}
