package easy._0400_0499._448_find_all_numbers_disappeared_in_an_array;

//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elemen
//ts appear twice and others appear once.
//
// Find all the elements of [1, n] inclusive that do not appear in this array.
//
// Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
// Example:
//
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[5,6]
//
// Related Topics Array


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了100.00% 的Java用户
  //  内存消耗:48.7 MB,击败了32.08% 的Java用户
  public List<Integer> findDisappearedNumbers(int[] nums) {
    boolean[] map = new boolean[nums.length];
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      map[nums[i] - 1] = true;
    }
    for (int i = 0; i < map.length; i++) {
      if (!map[i]) {
        res.add(i + 1);
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

