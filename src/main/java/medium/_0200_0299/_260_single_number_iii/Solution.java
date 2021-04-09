package medium._0200_0299._260_single_number_iii;

//Given an integer array nums, in which exactly two elements appear only once
// and all the other elements appear exactly twice.
// Find the two elements that appear only once. You can return the answer in any order.
//
// Follow up: Your algorithm should run in linear runtime complexity. Could you
//implement it using only constant space complexity?
//
//
// Example 1:
//
//
//Input: nums = [1,2,1,3,2,5]
//Output: [3,5]
//Explanation:  [5, 3] is also a valid answer.
//
//
// Example 2:
//
//
//Input: nums = [-1,0]
//Output: [-1,0]
//
//
// Example 3:
//
//
//Input: nums = [0,1]
//Output: [1,0]
//
//
//
// Constraints:
//
//
// 2 <= nums.length <= 3 * 104
// -2^31 <= nums[i] <= 2^31 - 1
// Each integer in nums will appear twice, only two integers will appear once.
//
// Related Topics Bit Manipulation
// 👍 2220 👎 132


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了95.93% 的Java用户
  //  内存消耗:38.9 MB,击败了80.27% 的Java用户
//  public int[] singleNumber(int[] nums) {
//    int xor = 0, flag = 1;
//    for (int n : nums) {
//      xor ^= n;
//    }
//    for (int i = 0; i < 32; i++) {
//      if ((xor & flag) != 0) {
//        break;
//      }
//      flag = flag << 1;
//    }
//    int groupALen = 0;
//
//    for (int i = 0; i < nums.length; i++) {
//      if ((nums[i] & flag) != 0) {
//        swap(i, groupALen++, nums);
//      }
//    }
//
//    int aXor = 0, bXor = 0;
//    for (int i = 0; i < groupALen; i++) {
//      aXor ^= nums[i];
//    }
//    for (int i = groupALen; i < nums.length; i++) {
//      bXor ^= nums[i];
//    }
//    return new int[]{aXor, bXor};
//  }
//
//  public void swap(int i, int j, int[] nums) {
//    int tmp = nums[i];
//    nums[i] = nums[j];
//    nums[j] = tmp;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39 MB,击败了80.27% 的Java用户
  public int[] singleNumber(int[] nums) {
    // difference between two numbers (x and y) which were seen only once
    int bitmask = 0;
    for (int num : nums) {
      bitmask ^= num;
    }

    // rightmost 1-bit diff between x and y
    int diff = bitmask & (-bitmask);

    int x = 0;
    // bitmask which will contain only x
    for (int num : nums) {
      if ((num & diff) != 0) {
        x ^= num;
      }
    }

    return new int[]{x, bitmask ^ x};
  }
}
//leetcode submit region end(Prohibit modification and deletion)
