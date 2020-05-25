package easy._600_699._628_maximum_product_of_three_numbers;

//Given an integer array,
// find three numbers whose product is maximum and output the maximum product.
//
// Example 1:
//
//
//Input: [1,2,3]
//Output: 6
//
//
//
//
// Example 2:
//
//
//Input: [1,2,3,4]
//Output: 24
//
//
//
//
// Note:
//
//
// The length of the given array will be in range [3,104]
// and all elements are in the range [-1000, 1000].
// Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
//
//
//
// Related Topics Array Math


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:9 ms,击败了63.42% 的Java用户
  //  内存消耗:41.4 MB,击败了7.14% 的Java用户
//  public int maximumProduct(int[] nums) {
//    Arrays.sort(nums);
//    int len = nums.length, twoNegOnePos = nums[0] * nums[1] * nums[len - 1];
//    int threePos = nums[len - 1] * nums[len - 2] * nums[len - 3];
//    return twoNegOnePos < threePos ? threePos : twoNegOnePos;
//  }

  //  解答成功:
  //  执行耗时:2 ms,击败了99.08% 的Java用户
  //  内存消耗:40.3 MB,击败了82.14% 的Java用户
//  public int maximumProduct(int[] nums) {
//    if (nums.length < 4) {
//      int res = nums[0];
//      for (int i = 1; i < nums.length; i++) {
//        res *= nums[i];
//      }
//      return res;
//    }
//    int[] map = new int[2001];
//    int min = Integer.MAX_VALUE, minAdd = -1, max = Integer.MIN_VALUE, maxAdd = -1;
//    for (int num : nums) {
//      map[num + 1000]++;
//      if (max < num) {
//        max = num;
//        maxAdd = num + 1000;
//      }
//      if (num < min) {
//        min = num;
//        minAdd = num + 1000;
//      }
//    }
//    int twoNegOnePos = min * max, threePos = max, threePosFlag = 1;
//    map[minAdd]--;
//    map[maxAdd]--;
//    while (minAdd <= 1000) {
//      if (0 < map[minAdd]) {
//        twoNegOnePos *= minAdd - 1000;
//        break;
//      }
//      minAdd++;
//
//    }
//    while (1000 <= maxAdd) {
//      if (0 < map[maxAdd]) {
//        threePos *= maxAdd - 1000;
//        map[maxAdd]--;
//        threePosFlag++;
//        if (threePosFlag == 3) {
//          break;
//        }
//        continue;
//      }
//      maxAdd--;
//    }
//
//    return twoNegOnePos < threePos ? threePos : twoNegOnePos;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:41.2 MB,击败了28.57% 的Java用户
  public int maximumProduct(int[] nums) {
    if (nums.length < 4) {
      int res = nums[0];
      for (int i = 1; i < nums.length; i++) {
        res *= nums[i];
      }
      return res;
    }
    int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE, min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
    for (int num : nums) {
      if (thirdMax < num) {
        if (secondMax < num) {
          if (max < num) {
            thirdMax = secondMax;
            secondMax = max;
            max = num;
          } else {
            thirdMax = secondMax;
            secondMax = num;
          }
        } else {
          thirdMax = num;
        }
      }
      if (num < secondMin) {
        if (num < min) {
          secondMin = min;
          min = num;
        } else {
          secondMin = num;
        }
      }
    }
    return max * Math.max(secondMax * thirdMax, secondMin * min);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

