import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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

// 70/70 cases passed (0 ms)
// Your runtime beats 100 % of java submissions
// Your memory usage beats 21.14 % of java submissions (42.2 MB)
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      TreeNode curr = root;
      TreeNode pre;
      List<Integer> res = new ArrayList<>();

      while (curr != null) {
        if (curr.left == null) {
          res.add(curr.val);
          curr = curr.right;
        } else {
          pre = curr.left;
          while (pre.right != null) {
            pre = pre.right;
          }
          pre.right = curr;
          TreeNode tmp = curr;
          curr = curr.left;
          tmp.left = null;
        }
      }
      return res;
    }
}
// @lc code=end

