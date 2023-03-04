package leetcode;

public class Test215 {
    public static void main(String[] args) {
        Solution215 solution215 = new Solution215();
        int kthLargest = solution215.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 4);
        System.out.println(kthLargest);

        Solution215_1 solution2151 = new Solution215_1();
        int sort = solution2151.sort(new int[]{3, 2, 1, 5, 6, 4}, 4);
        System.out.println(sort);

    }
}
class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        build_maxHeap(nums);
        for (int i = 0; i < k - 1; i++) {
            int tmp = nums[0];
            nums[0] = nums[n-1-i];
            nums[n-1-i] = tmp;
            adjust_down(nums,0,n-1-i-1);
        }
        return nums[0];
    }

    public void build_maxHeap(int[] nums){
        int n = nums.length;
        for(int root = n / 2; root > -1; root--){
            adjust_down(nums,root,n-1);
        }
    }

    public void adjust_down(int[] nums,int root,int hi){
        if(root > hi){
            return ;
        }
        int t = nums[root];
        int child = 2 * root + 1;
        while(child <= hi){
            if(child + 1 <= hi && nums[child] < nums[child + 1]){
                child ++;
            }
            if(t > nums[child]){
                break;
            }
            nums[root] = nums[child];
            root = child;
            child = 2 * root + 1;
        }
        nums[root] = t;
    }

}
class Solution215_1{
    public int sort(int [] arr,int k){
        int a = arr.length;
        //新建大根堆
        buid(arr);
        //操作这个大根堆
        for(int i = 0;i < k - 1;i++){
            int tmp = arr[0];
            arr[0] = arr[a-1-i];
            arr[a-i-1] = tmp;
            heapsort1(arr,0,a-i-2);
        }
        return arr[0];
    }

    //新建大根堆的方法
    public void buid(int [] arr){
        int n = arr.length;
        for(int i = n / 2;i > -1;i--){
            //操作大根堆的具体方法
            heapsort1(arr,i,n-1);
        }
    }
    //堆排序的核心
    public void heapsort(int[] arr,int i,int j){
        if(i > j){
            return;
        }
        int a = arr[i];
        for(int k = i * 2 + 1;k <= arr.length;k=k*2+1){
            if(k + 1 < j && arr[k] < arr[k + 1]){
                k++;
            }
            if(arr[k] > a){
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }
        }
        arr[i] = a;
    }
    public void heapsort1(int[] arr,int i,int j){
        if(i > j){
            return;
        }
        int a = arr[i];
        int k = 2 * i + 1;
        while(k <= j){
            if(k + 1 <= j && arr[k] < arr[k + 1]){
                k++;
            }
            if(a > arr[k]){
                break;
            }
            arr[i] = arr[k];
            i = k;
            k = k * 2 + 1;
        }
        arr[i] = a;
    }

}
