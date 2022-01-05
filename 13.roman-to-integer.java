/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
      int ans = 0;
      s = s.replaceFirst("IV", "IIII");
      s = s.replaceFirst("IX", "VIIII");
      s = s.replaceFirst("XL", "XXXX");
      s = s.replaceFirst("XC", "LXXXX");
      s = s.replaceFirst("CD", "CCCC");
      s = s.replaceFirst("CM", "DCCCC");

      if (s.contains("M")) {
        ans += 1000 * (s.lastIndexOf('M') - s.indexOf('M') + 1);
      }
      
      if (s.contains("D")) {
        ans += 500 * (s.lastIndexOf('D') - s.indexOf('D') + 1);
      }
      if (s.contains("C")) {
        ans += 100 * (s.lastIndexOf('C') - s.indexOf('C') + 1);
      }
      if (s.contains("L")) {
        ans += 50 * (s.lastIndexOf('L') - s.indexOf('L') + 1);
      }
      if (s.contains("X")) {
        ans += 10 * (s.lastIndexOf('X') - s.indexOf('X') + 1);
      }
      if (s.contains("V")) {
        ans += 5 * (s.lastIndexOf('V') - s.indexOf('V') + 1);
      }
      if (s.contains("I")) {
        ans += 1 * (s.lastIndexOf('I') - s.indexOf('I') + 1);
      }

      return ans;

    }
}
// @lc code=end

