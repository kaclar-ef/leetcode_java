/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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

// 208/208 cases passed (1 ms)
// Your runtime beats 29.38 % of java submissions
// Your memory usage beats 12.86 % of java submissions (40 MB)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if(list1 == null && list2 == null) {
        return null;
      }

      ListNode headOfListNode = new ListNode();
      ListNode targetListNode = headOfListNode;
      boolean isFirstLoop = true;

      while (!(list1 == null && list2 == null)) {
        if (isFirstLoop) {
          isFirstLoop = false;
        } else {
          targetListNode.next = new ListNode();
          targetListNode = targetListNode.next;
        }

        if (list1 == null) {
          targetListNode.val = list2.val;
          list2 = list2.next;
        }
        else if (list2 == null) {
          targetListNode.val = list1.val;
          list1 = list1.next;
        }
        else if (list1.val <= list2.val) {
          targetListNode.val = list1.val;
          list1 = list1.next;
        }
        else {
          targetListNode.val = list2.val;
          list2 = list2.next;
        }
      }
      return headOfListNode;
    }
}
// @lc code=end

