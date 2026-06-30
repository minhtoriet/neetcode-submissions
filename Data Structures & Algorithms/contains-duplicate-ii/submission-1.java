class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])) {
                for (int j = 0; j < i; j++){
                    if (nums[j] == nums[i] && i - j <= k) return true;
                }
            }
            set.add(nums[i]);
        }
        return false;
    }
}