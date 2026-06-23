class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        int[] sol = new int[2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int i = 0, j = nums.length - 1;
        while (i < j){
            if (arr[i][0] + arr[j][0] > target) j--;
            else if (arr[i][0] + arr[j][0] < target) i++;
            else {
                sol[0] = arr[j][1];
                sol[1] = arr[i][1];
                break;
            }
        }
        if (sol[0]>sol[1]) {
            sol[0] += sol[1];
            sol[1] = sol[0] - sol[1];
            sol[0] -= sol[1];  
        }
        return sol;
    }
}
