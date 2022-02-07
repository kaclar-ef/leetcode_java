/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// 166/166 cases passed (1 ms)
// Your runtime beats 58.73 % of java submissions
// Your memory usage beats 13.05 % of java submissions (43.5 MB)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      if (head == null) {
        return head;
      }
      ListNode prev = head;
      ListNode target = head.next;

      while (target != null) {
        if (target.val == prev.val) {
          prev.next = target.next;
        } else {
          prev = target;
        }
        target = target.next;
      }
      return head;
    }
}
// @lc code=end

