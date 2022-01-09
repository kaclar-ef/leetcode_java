/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// 64/64 cases passed (0 ms)
// Your runtime beats 100 % of java submissions
// Your memory usage beats 22.27 % of java submissions (40.6 MB)

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while (true) {
          if (nums[mid] == target) {
            return mid;
          } else if(nums[mid] < target) {
            left = mid + 1;
            mid = (left + right) / 2;
            if (left > right || nums[left] > target) {
              return left;
            }
          } else if(nums[mid] > target) {
            right = mid - 1;
            mid = (left + right) / 2;
            if (left > right || nums[right] < target) {
              return right + 1;
            }
          }
        }
    }

    // 普通のbinary searchをして、ループから抜けた後leftを返すだけで良かった。
}
// @lc code=end

