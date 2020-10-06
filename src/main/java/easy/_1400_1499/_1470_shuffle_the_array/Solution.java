package easy._1400_1499._1470_shuffle_the_array;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//
// Example 1:
//
//
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//
//
// Example 2:
//
//
//Input: nums = [1,2,3,4,4,3,2,1], n = 4
//Output: [1,4,2,3,3,2,4,1]
//
//
// Example 3:
//
//
//Input: nums = [1,1,2,2], n = 2
//Output: [1,2,1,2]
//
//
//
// Constraints:
//
//
// 1 <= n <= 500
// nums.length == 2n
// 1 <= nums[i] <= 10^3
// Related Topics Array
// 👍 598 👎 68


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.3 MB,击败了83.63% 的Java用户
  public int[] shuffle(int[] nums, int n) {
    int len = nums.length, idx = 0;
    int[] res = new int[len];
    for (int i = 0; i < len; i += 2, idx++) {
      res[i] = nums[idx];
      res[i + 1] = nums[idx + n];
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

