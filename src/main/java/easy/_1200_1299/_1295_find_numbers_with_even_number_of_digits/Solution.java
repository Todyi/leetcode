package easy._1200_1299._1295_find_numbers_with_even_number_of_digits;

//Given an array nums of integers, return how many of them contain an even number of digits.
// 
// Example 1: 
//
// 
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation: 
//12 contains 2 digits (even number of digits).
//345 contains 3 digits (odd number of digits).
//2 contains 1 digit (odd number of digits).
//6 contains 1 digit (odd number of digits).
//7896 contains 4 digits (even number of digits).
//Therefore only 12 and 7896 contain an even number of digits.
// 
//
// Example 2: 
//
// 
//Input: nums = [555,901,482,1771]
//Output: 1 
//Explanation: 
//Only 1771 contains an even number of digits.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 500 
// 1 <= nums[i] <= 10^5 
// 
// Related Topics Array 
// 👍 445 👎 62


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.5 MB,击败了99.82% 的Java用户
  public int findNumbers(int[] nums) {
    int count = 0;
    for (int i : nums) {
      if ((9 < i && i < 100) || (999 < i && i < 10000) || i == 100000) {
        count++;
      }
    }
    return count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

