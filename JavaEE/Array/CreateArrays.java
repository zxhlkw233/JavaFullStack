package JavaEE.Array;

public class CreateArrays {
    public static void main(String[] args) {
        //第一种方式
        int [] array = new int[10];
        //第二种方式
        int[] array1;
        array1 = new int[10];
        //第三种方式
        int[] array2 = new int[]{1,2,3};
        //第四种方式
        int[] array3 = {1,2,3};

        //二维数组的创建,分配空间大小
        int[][] array4 = new int[2][2];

        //通过new给数组赋值，不给空间大小
        int[][] array5 = new int[][]{{1,2},{2,3}};

        //直接给数组赋值，空间大小不分配
        int[][] array6 = {{1,2,3},{1,2,3},{1,1,1}};

        //数组的二维长度为空
        int[][] array7 = new int[2][];


    }
}
