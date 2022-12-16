package JavaEE.Array;

public class Test1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        int[] array1 = new int[]{1,2,3,4,5};
        for(int i = 0;i < array.length/2;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i = 0;i < array1.length/2;i++){
            System.out.print(array1[i]+" ");
        }
    }

}
