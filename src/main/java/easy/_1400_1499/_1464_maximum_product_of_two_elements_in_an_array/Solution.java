package easy._1400_1499._1464_maximum_product_of_two_elements_in_an_array;

//Given the array of integers nums, you will choose two different indices i and j of that array.
// Return the maximum value of (nums[i]-1)*(nums[j]-1).
//
// Example 1:
//
//
//Input: nums = [3,4,5,2]
//Output: 12
//Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will
//get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12
//.
//
//
// Example 2:
//
//
//Input: nums = [1,5,4,5]
//Output: 16
//Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get t
//he maximum value of (5-1)*(5-1) = 16.
//
//
// Example 3:
//
//
//Input: nums = [3,7]
//Output: 12
//
//
//
// Constraints:
//
//
// 2 <= nums.length <= 500
// 1 <= nums[i] <= 10^3
//
// Related Topics Array
// 👍 246 👎 63


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.7 MB,击败了89.28% 的Java用户
  public int maxProduct(int[] nums) {
    int max = 1, secMax = 1;
    for (int n : nums) {
      if (secMax < n) {
        if (max < n) {
          secMax = max;
          max = n;
        } else {
          secMax = n;
        }
      }
    }
    return (max - 1) * (secMax - 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

