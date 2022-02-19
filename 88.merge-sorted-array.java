/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start

// 59/59 cases passed (0 ms)
// Your runtime beats 100 % of java submissions
// Your memory usage beats 27.43 % of java submissions (42.4 MB)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int index = m + n - 1;
      for (int i = m-1, j = n-1; j >= 0; index--) {
        if (i < 0 || nums1[i] <= nums2[j]) {
          nums1[index] = nums2[j];
          j--;
          continue;
        } else {
          nums1[index] = nums1[i];
          i--;
        }
      }
    }
}
// @lc code=end