class Solution {
    public int search(int[] nums, int target) {
        return binary(0,nums.length - 1,nums,target);
    }
    public int binary(int l, int r, int[] nums, int target){
        if (l > r) return -1;
        int middle = (l+r)/2;
        if (nums[middle] == target) return middle;
        return (nums[middle] > target) ? binary(l,middle-1,nums,target) :
                                            binary(middle+1,r,nums,target);
    }
}
