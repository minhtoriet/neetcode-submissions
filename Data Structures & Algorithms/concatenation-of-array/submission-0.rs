impl Solution {
    pub fn get_concatenation(nums: Vec<i32>) -> Vec<i32> {
        let len = nums.len();
        let mut arr = vec![0 ; len * 2];
        for i in 0..len {
            arr[i] = nums[i];
        }
        for i in nums.len()..2 * len {
            arr[i] = nums[i - len];
        }
        arr
    }
}
