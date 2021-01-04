package medium._0000_0099._095_unique_binary_search_trees_ii;

//Given an integer n, generate all structurally unique BST's (binary search trees) 
// that store values 1 ... n. 
//
// Example: 
//
// 
//Input: 3
//Output:
//[
// [1,null,3,2],
// [3,2,null,1],
// [3,1,null,null,2],
// [2,1,3],
// [1,null,2,null,3]
//]
//Explanation:
//The above output corresponds to the 5 unique BST's shown below:
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3
//
// 
//
// 
// Constraints: 
//
// 
// 0 <= n <= 8 
// 
// Related Topics Dynamic Programming Tree 
// 👍 2715 👎 195

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
  //  内存消耗:39.4 MB,击败了76.98% 的Java用户
  public List<TreeNode> generateTrees(int n) {
    return buildTree(1, n);
  }

  public ArrayList<TreeNode> buildTree(int start, int end) {
    ArrayList<TreeNode> trees = new ArrayList<>();
    if (end < start) {
      return trees;
    }
    if (start == end) {
      trees.add(new TreeNode(start));
      return trees;
    }
    for (int i = start; i <= end; i++) {
      List<TreeNode> lChildren = buildTree(start, i-1), rChildren = buildTree(i + 1, end);
      if (lChildren.size() == 0) {
        for (TreeNode rChild : rChildren) {
          trees.add(new TreeNode(i, null, rChild));
        }
      } else if (rChildren.size() == 0) {
        for (TreeNode lChild : lChildren) {
          trees.add(new TreeNode(i, lChild, null));
        }
      } else {
        for (TreeNode lChild : lChildren) {
          for (TreeNode rChild : rChildren) {
            trees.add(new TreeNode(i, lChild, rChild));
          }
        }
      }
    }
    return trees;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

