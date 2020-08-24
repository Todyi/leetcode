package easy._800_899._897_increasing_order_search_tree;

//Given a binary search tree, rearrange the tree in in-order so that the leftmos
//t node in the tree is now the root of the tree, and every node has no left child
// and only 1 right child. 
//
// 
//Example 1:
//Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]
//
//       5
//      / \
//    3    6
//   / \    \
//  2   4    8
///        / \ 
//1        7   9
//
//Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
//
// 1
// \
//  2
//   \
//    3
//     \
//      4
//       \
//        5
//         \
//          6
//           \
//            7
//             \
//              8
//               \
//                 9  
// 
// Constraints: 
//
// 
// The number of nodes in the given tree will be between 1 and 100. 
// Each node will have a unique integer value from 0 to 1000. 
// 
// Related Topics Tree Depth-first Search 
// 👍 730 👎 467

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了20.56% 的Java用户
  TreeNode head;
  TreeNode preNode;

  public TreeNode increasingBST(TreeNode root) {
    inOrder(root);
    return head;
  }

  public void inOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    if (preNode != null) {
      preNode.right = node;
      preNode = node;
    } else {
      preNode = node;
      if (head == null) {
        head = preNode;
      }
    }
    node.left = null;
    inOrder(node.right);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

