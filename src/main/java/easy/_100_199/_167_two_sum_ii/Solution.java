package easy._100_199._167_two_sum_ii;

//Given an array of integers that is already sorted in ascending order, find two
// numbers such that they add up to a specific target number.
//
// The function twoSum should return indices of the two numbers such that they a
//dd up to the target, where index1 must be less than index2.
//
// Note:
//
//
// Your returned answers (both index1 and index2) are not zero-based.
// You may assume that each input would have exactly one solution and you may no
//t use the same element twice.
//
//
// Example:
//
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
// Related Topics Array Two Pointers Binary Search


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:174 ms,击败了9.14% 的Java用户
  //  内存消耗:39.6 MB,击败了5.22% 的Java用户
//  public int[] twoSum(int[] numbers, int target) {
//
//    if (numbers == null) {
//      return null;
//    }
//
//    if (numbers.length == 1) {
//      if (target == numbers[0]) {
//        int[] result = {numbers[0]};
//        return result;
//      }
//      return null;
//    }
//
//    for (int i = 0; i < numbers.length; i++) {
//      int remain = target - numbers[i];
//      for (int j = i + 1; j < numbers.length; j++) {
//        if (remain == numbers[j]) {
//          int[] result = {i + 1, j + 1};
//          return result;
//        }
//      }
//    }
//    return null;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了47.20% 的Java用户
  //  内存消耗:39.4 MB,击败了5.22% 的Java用户
//  public int[] twoSum(int[] numbers, int target) {
//    Map<Integer, Integer> map = new HashMap<>();
//    for (int i = 0; i < numbers.length; i++) {
//      int remain = target - numbers[i];
//      if (map.get(remain) != null) {
//        int[] result = {map.get(remain), i + 1};
//        return result;
//      } else {
//        map.put(numbers[i], i + 1);
//      }
//    }
//    return null;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了8.95% 的Java用户
  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      int sum = numbers[left] + numbers[right];
      if (sum == target) {
        return new int[]{left + 1, right + 1};
      } else if (sum < target){
        left++;
      }else {
        right--;
      }
    }
    return null;

  }
}
//leetcode submit region end(Prohibit modification and deletion)

