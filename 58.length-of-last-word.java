/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start

// 58/58 cases passed (0 ms)
// Your runtime beats 100 % of java submissions
// Your memory usage beats 75.48 % of java submissions (37.2 MB)
class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().length() - (s.trim().lastIndexOf(" ") + 1);
    }
}
// @lc code=end

