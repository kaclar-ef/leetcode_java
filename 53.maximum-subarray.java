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
        // 右隣を足して、マイナスになったら破棄する感じ？
        // １つの数だけで最大になる可能性もあるし
        int currentSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {
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

