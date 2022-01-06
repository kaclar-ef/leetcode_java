/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Your runtime beats 30.82 % of java submissions
        // Your memory usage beats 9.42 % of java submissions (39.3 MB)
        String firstStr = strs[0];
        String prefix;
        int numberOfPrefixChars = 0;

        while (++numberOfPrefixChars <= firstStr.length()) {
          prefix = firstStr.substring(0, numberOfPrefixChars);
          
          for (int i = 1; i < strs.length; i++) {
            if (strs[i].startsWith(prefix)) {
              continue;    
            } else {
              return firstStr.substring(0, numberOfPrefixChars - 1);
            }
          }
        }
        return firstStr.substring(0, numberOfPrefixChars - 1);
    }
}
// @lc code=end

