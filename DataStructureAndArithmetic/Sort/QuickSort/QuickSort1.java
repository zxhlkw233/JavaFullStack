package DataStructureAndArithmetic.Sort.QuickSort;

public class QuickSort1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.quickSort(new int[]{3,2,1,5,6,4},0,5);
        
    }
}

class Test1{
    public void quickSort(int[] ary,int l,int r){
        if(l < r){
            int n = partition(ary,l,r);
            quickSort(ary,l,n-1);
            quickSort(ary,n+1,r);
        }
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println();
    }
    public int partition(int[] ary,int l,int r){
        int pivot = ary[r];
        while(l < r){
            while(l < r && ary[l] < pivot) l++;
            ary[r] = ary[l];
            while(l < r && ary[r] >= pivot) r--;
            ary[l] = ary[r];
        }
        ary[l] = pivot;
        return l;
    }
}