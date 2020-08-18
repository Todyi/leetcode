package easy._800_899._872_leaf_similar_trees;

//Consider all the leaves of a binary tree.
// From left to right order, the values of those leaves form a leaf value sequence.
//
//
//
// For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
//
// Two binary trees are considered leaf-similar if their leaf value sequence is
//the same.
//
// Return true if and only if the two given trees with head nodes root1 and root
//2 are leaf-similar.
//
//
// Constraints:
//
//
// Both of the given trees will have between 1 and 200 nodes.
// Both of the given trees will have values between 0 and 200
//
// Related Topics Tree Depth-first Search
// 👍 807 👎 42

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了75.92% 的Java用户
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> leafRoot1 = new ArrayList<>();
    List<Integer> leafRoot2 = new ArrayList<>();
    preOrder(root1, leafRoot1);
    preOrder(root2, leafRoot2);
    if (leafRoot1.size() != leafRoot2.size()) {
      return false;
    }
    for (int i = 0; i < leafRoot1.size(); i++) {
      if (!leafRoot1.get(i).equals(leafRoot2.get(i))) {
        return false;
      }
    }
    return true;
  }

  public void preOrder(TreeNode node, List<Integer> leafSeq) {
    if (node == null) {
      return;
    }
    preOrder(node.left, leafSeq);
    if (node.left == null && node.right == null) {
      leafSeq.add(node.val);
    }
    preOrder(node.right, leafSeq);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

