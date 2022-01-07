import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start


// 91/91 cases passed (4 ms)
// Your runtime beats 17.12 % of java submissions
// Your memory usage beats 28.69 % of java submissions (38.5 MB)
class Solution {
  static Map<Character, Character> charPairs = new HashMap<Character, Character>();
  static {
    charPairs.put('(', ')');
    charPairs.put('{', '}');
    charPairs.put('[', ']');
  }
    public boolean isValid(String s) {
      // 文字数が奇数ならアウト
      // ({[が出てきたらArrayListにペアをしまっておく
      // )}]が出てきたらしまっていた一番最後と一致するか確かめる
      int length = s.length();
      if (length % 2 == 1) {
        return false;
      }
      
      List<Character> stockList = new ArrayList<Character>();
      int listLength = -1;

      for (int i = 0; i < s.length(); i++) {
        char targetChar = s.charAt(i);
        if (targetChar == '(' || targetChar == '{' || targetChar == '[') {
          stockList.add(charPairs.get(targetChar));
          listLength ++;
        } else {
          if (listLength == -1 || targetChar != stockList.remove(listLength)) {
            return false;
          } else {
            listLength--;
          }
        }
      }

      if (listLength == -1) {
        return true;
      } else {
        return false;
      }
    }
}
// @lc code=end

