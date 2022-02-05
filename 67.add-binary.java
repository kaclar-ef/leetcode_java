/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start

// 294/294 cases passed (4 ms)
// Your runtime beats 43.67 % of java submissions
// Your memory usage beats 5.08 % of java submissions (43 MB)
class Solution {
    public String addBinary(String a, String b) {
      // ループの中でcharAtで文字をとり、StringBuilderで結合していく
      // ループのやり方が問題
      String longerString;
      String shorterString;
      StringBuilder sb = new StringBuilder();
      char aBinary;
      char bBinary;
      int carryNum = 0;

      if (a.length() >= b.length()) {
        longerString = a;
        shorterString = b;
      } else {
        longerString = b;
        shorterString = a;
      }

      for (int i = longerString.length() - 1, j = shorterString.length() - 1; i >= 0 || carryNum == 1; i--, j--) {
        if (i >= 0) {
          aBinary = longerString.charAt(i);
        } else {
          aBinary = '0';
        }
        if (j >= 0) {
          bBinary = shorterString.charAt(j);
        } else {
          bBinary = '0';
        }
        int sum = Character.getNumericValue(aBinary) + Character.getNumericValue(bBinary) + carryNum;

        if (sum == 3) {
          sum = 1;
          carryNum = 1;
        } else if(sum == 2) {
          sum = 0;
          carryNum = 1;
        }else {
          carryNum = 0;
        }

        sb.insert(0,sum);
      }

      return sb.toString();
    }
}
// @lc code=end

