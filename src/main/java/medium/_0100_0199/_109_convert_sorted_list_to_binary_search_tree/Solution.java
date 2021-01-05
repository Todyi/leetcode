package medium._0100_0199._109_convert_sorted_list_to_binary_search_tree;

//Given the head of a singly linked list where elements are sorted in ascending
//order, convert it to a height balanced BST.
//
// For this problem, a height-balanced binary tree is defined as a binary tree
// in which the depth of the two subtrees of every node never differ by more than 1.
//
//
//
// Example 1:
//
//
//Input: head = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: One possible answer is [0,-3,9,-10,null,5],
// which represents the shown height balanced BST.
//
//
// Example 2:
//
//
//Input: head = []
//Output: []
//
//
// Example 3:
//
//
//Input: head = [0]
//Output: [0]
//
//
// Example 4:
//
//
//Input: head = [1,3]
//Output: [3,1]
//
//
//
// Constraints:
//
//
// The number of nodes in head is in the range [0, 2 * 104].
// -10^5 <= Node.val <= 10^5
//
// Related Topics Linked List Depth-first Search
// 👍 2567 👎 94

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */

import common.ListNode;
import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.9 MB,击败了70.60% 的Java用户
  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode fast = head, slow = head, preNode = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      preNode = slow;
      slow = slow.next;
    }
    TreeNode root = null;
    if (slow != null) {
      root = new TreeNode(slow.val);
    }
    if (slow == head) {
      return root;
    }
    preNode.next = null;
    root.left = sortedListToBST(head);
    root.right = sortedListToBST(slow.next);

    return root;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

