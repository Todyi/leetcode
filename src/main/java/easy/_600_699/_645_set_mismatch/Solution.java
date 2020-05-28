package easy._600_699._645_set_mismatch;

//
//The set S originally contains numbers from 1 to n.
// But unfortunately, due to the data error,
// one of the numbers in the set got duplicated to another number in the set,
// which results in repetition of one number and loss of another number.
//
//
//
//
//Given an array nums representing the data status of this set after the error.
//Your task is to firstly find the number occurs twice and then find the number that is missing.
// Return them in the form of an array.
//
//
//
// Example 1:
//
//Input: nums = [1,2,2,4]
//Output: [2,3]
//
//
//
// Note:
//
// The given array size will in the range [2, 10000].
// The given array's numbers won't have any order.
//
// Related Topics Hash Table Math


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:8 ms,击败了50.14% 的Java用户
  //  内存消耗:40.4 MB,击败了100.00% 的Java用户
  public int[] findErrorNums(int[] nums) {
    Arrays.sort(nums);
    int[] res = new int[2];
    int sum = nums[0], i = 1;
    for (; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        res[0] = nums[i];
        break;
      }
      sum += nums[i];
    }
    for (; i < nums.length; i++) {
      sum += nums[i];
    }
    //1+2+3+..+n = n(n+1)/2
    //1+2+..+k+k+...+n = n(n+1)/2-miss+k
    //miss = n(n+1)/2-sum+k
    res[1] = nums.length * (nums.length + 1) / 2 - sum + res[0];
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

