package medium._0000_0099._096_unique_binary_search_trees;

//Given n, how many structurally unique BST's (binary search trees) that store v
//alues 1 ... n?
//
// Example:
//
//
//Input: 3
//Output: 5
//Explanation:
//Given n = 3, there are a total of 5 unique BST's:
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3
//
//
//
// Constraints:
//
//
// 1 <= n <= 19
//
// Related Topics Dynamic Programming Tree
// 👍 4141 👎 152


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:35.8 MB,击败了32.60% 的Java用户
  Integer[] map = new Integer[20];

  public int numTrees(int n) {
    if (n <= 1) {
      return 1;
    }
    if (map[n] != null) {
      return map[n];
    }
    int res = 0;
    for (int i = 1; i <= n; i++) {
      int l = numTrees(i - 1), r = numTrees(n - i);
      res += l * r;
      map[n] = res;
    }
    return res;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

