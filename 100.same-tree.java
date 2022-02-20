import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      Stack<TreeNode> stack = new Stack<>();
      TreeNode currP = p;
      TreeNode currQ = q;

      while (currP != null || currQ != null || !stack.isEmpty()) {
        while (currP != null && currQ != null) {
          if (currP.val == currQ.val) {
            stack.push(currP);
            stack.push(currQ);
            currP = currP.left;
            currQ = currQ.left;
          } else {
            return false;
          }
        }
        if (currP != null || currQ != null) {
          return false;
        }
        currP = stack.pop().right;
        currQ = stack.pop().right;
      }
      return true;
    }
}
// @lc code=end

