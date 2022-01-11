/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start

// 209/209 cases passed (1 ms)
// Your runtime beats 100 % of java submissions
// Your memory usage beats 71.87 % of java submissions (49.2 MB)
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
          currentSum += num;
          if (currentSum > maxSum) {
            maxSum = currentSum;
          }
          if (currentSum < 0) {
            currentSum = 0;
          }
        }
        return maxSum;
    }
}
// @lc code=end

