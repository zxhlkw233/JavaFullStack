package JavaEE.DataType.Arrays;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] a = new int[]{4, 3, 2, 1};

        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));


        int[] a1 = new int[]{4, 3, 2, 1};
        Arrays.parallelSort(a1, 0, 2);
        System.out.println(Arrays.toString(a1));

        int[] ints = Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(ints));

        boolean[] b = new boolean[]{false, true, false};
        Arrays.fill(b, true);
        System.out.println(Arrays.toString(b));


        Arrays.fill(a, 1);
        System.out.println(Arrays.toString(a));


    }
}
