/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start

// 45/45 cases passed (11 ms)
// Your runtime beats 8.93 % of java submissions
// Your memory usage beats 6.02 % of java submissions (44.3 MB)

import java.math.BigInteger;
class Solution {
    public int climbStairs(int n) {
      int steps = 0;
      int twoStepCount = 0;
      while (n - twoStepCount * 2 >= 0) {
        steps += calcFactorial(n - twoStepCount).divide((calcFactorial(twoStepCount).multiply(calcFactorial(n - twoStepCount * 2)))).intValue();
        twoStepCount ++;
      }
      return steps;
    }

    public BigInteger calcFactorial(int n) {
      if (n == 0) {
        return BigInteger.valueOf(1);
      }
      BigInteger[] ar = new BigInteger[n];
      for (int i=0; i<n; i++) {
        ar[i] = BigInteger.valueOf(i+1);
      }
      int t = 1, length = ar.length;
      while (t <= length) {
        for (int i=0; i<length; i+=(t<<1)) {
          if (t+i < length) {
            ar[i] = ar[i].multiply(ar[i+t]);
          }
        }
        t = t<<1;
      }
      return ar[0];
    }
}
// @lc code=end

