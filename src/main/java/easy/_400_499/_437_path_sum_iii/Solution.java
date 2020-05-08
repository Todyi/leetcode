package easy._400_499._437_path_sum_iii;

//You are given a binary tree in which each node contains an integer value.
//
// Find the number of paths that sum to a given value.
//
// The path does not need to start or end at the root or a leaf, but it must go
//downwards
//(traveling only from parent nodes to child nodes).
//
// The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
//
// Example:
//
//root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
//
//      10
//     /  \
//    5   -3
//   / \    \
//  3   2   11
// / \   \
//3  -2   1
//
//Return 3. The paths that sum to 8 are:
//
//1.  5 -> 3
//2.  5 -> 2 -> 1
//3. -3 -> 11
//
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:22 ms,击败了33.25% 的Java用户
  //  内存消耗:39.2 MB,击败了88.64% 的Java用户
//  public int pathSum(TreeNode root, int sum) {
//    if (root == null) {
//      return 0;
//    }
//    return pathSumHelper(root, sum) + pathSum(root.left, sum) + pathSum(root.right,
//        sum);
//  }
//
//  public int pathSumHelper(TreeNode root, int sum) {
//    if (root == null) {
//      return 0;
//    }
//    return (root.val == sum ? 1 : 0)
//        + pathSumHelper(root.left, sum - root.val)
//        + pathSumHelper(root.right, sum - root.val);
//  }

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了90.91% 的Java用户
  public int pathSum(TreeNode root, int sum) {
    Map<Integer, Integer> pathSumCountMap = new HashMap<>();
    return pathSumHelper(root, pathSumCountMap, 0, sum);
  }

  public int pathSumHelper(TreeNode node, Map<Integer, Integer> pathSumCountMap,
      int pathSum, int sum) {
    if (node == null) {
      return 0;
    }
    pathSum += node.val;
    int result = pathSumCountMap.getOrDefault(pathSum - sum, 0);
    if (pathSum == sum){
      result++;
    }
    pathSumCountMap.put(pathSum, pathSumCountMap.getOrDefault(pathSum, 0) + 1);
    result += pathSumHelper(node.left, pathSumCountMap, pathSum, sum);
    result += pathSumHelper(node.right, pathSumCountMap, pathSum, sum);
    pathSumCountMap.put(pathSum, pathSumCountMap.get(pathSum) - 1);
    return result;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

