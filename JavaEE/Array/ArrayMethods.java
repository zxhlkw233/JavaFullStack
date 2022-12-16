package JavaEE.Array;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};

        //输出数组
        System.out.println(Arrays.toString(array));

        //数组复制 Arrays.copyOf
        //先创建一个数组在对他这样操作是可以的，但是必须要用它当作返回值，
        /*
        * 不能
        * int[] array = new [array.length];
        * Arrays.copyOf(array, array.length);
        * 这样是没有效果的
        * */
        int[] ints = Arrays.copyOf(array, array.length);

        System.out.println(Arrays.toString(ints));
        //数组复制 copyOfRange()方法对数组进行复制
        /*
        * 1.srcArray 表示原数组。
          2.startIndex 表示开始复制的起始索引，目标数组中将包含起始索引对应的元素，
            另外，startIndex 必须在 0 到 srcArray.length 之间。
          3.endIndex 表示终止索引，目标数组中将不包含终止索引对应的元素，endIndex 必须大于等于 startIndex，
            可以大于 srcArray.length，如果大于 srcArray.length，则目标数组中使用默认值填充。
        * */
        int[] ints1 = Arrays.copyOfRange(array, 1, 3);
        System.out.println(Arrays.toString(ints1));
        //数组复制 System.arraycopy
        int[] array1 = new int[array.length];
        //System.arraycopy(dataType[] srcArray,int srcIndex,int destArray,int destIndex,int length)
        //srcArray 表示原数组；srcIndex 表示原数组中的起始索引；destArray 表示目标数组；
        //destIndex 表示目标数组中的起始索引；length 表示要复制的数组长度。
        System.arraycopy(array,0,array1,0,array.length);
        System.out.println(Arrays.toString(array1));
        //数组复制 clone
        int[] array2 = array.clone();
        System.out.println(Arrays.toString(array2));

        //数组转list
        List ints2 = Arrays.asList(array);
        boolean contains1 = ints2.contains(1);
        System.out.println(contains1);//判断错误
        System.out.println("list"+ints2);

        //给数组排序
        Arrays.sort(array2);

        //数组是否包含某个值
        boolean contains = Arrays.asList(array).contains(2);
        System.out.println(contains);//判断错误
    }
}
