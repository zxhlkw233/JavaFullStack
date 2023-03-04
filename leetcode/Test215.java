package leetcode;

public class Test215 {
    public static void main(String[] args) {
        Solution215 solution215 = new Solution215();
        solution215.findKthLargest(new int[]{3,2,1,5,6,4},3);
    }
}
class Solution215 {
    public int findKthLargest(int[] nums, int k) {

    }

    public void build_maxHeap(int[] nums){
        int n = nums.length;
        for(int root = n / 2; root > -1; root--){

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
