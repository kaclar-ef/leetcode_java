/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {

// 11510/11510 cases passed (8 ms)
// Your runtime beats 48.54 % of java submissions
// Your memory usage beats 92.97 % of java submissions (38.1 MB)
       
        if (x < 0) {
            return false;
        }

        int length = (int) (Math.log10(x) + 1);
        int leftDigit = length;
        int rightDigit = 1;

        while (leftDigit >= rightDigit) {
            int leftDigitNum = x / (int)(Math.pow(10, leftDigit - 1)) % 10;
            int rightDigitNum = x / (int)(Math.pow(10, rightDigit - 1)) % 10;
            if (leftDigitNum != rightDigitNum) {
                return false;
            }
            leftDigit--;
            rightDigit++;
        }
        return true;
    }
}
// @lc code=end

