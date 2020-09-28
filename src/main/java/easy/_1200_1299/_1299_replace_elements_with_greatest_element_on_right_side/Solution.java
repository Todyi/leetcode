package easy._1200_1299._1299_replace_elements_with_greatest_element_on_right_side;

//Given an array arr,
// replace every element in that array with the greatest element among the elements to its right,
// and replace the last element with -1.
//
// After doing so, return the array.
//
//
// Example 1:
// Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]
//
//
// Constraints:
//
//
// 1 <= arr.length <= 10^4
// 1 <= arr[i] <= 10^5
// Related Topics Array
// 👍 483 👎 106


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.84% 的Java用户
  //  内存消耗:40.3 MB,击败了99.23% 的Java用户
  public int[] replaceElements(int[] arr) {
    int rightMax = -1, tmp, idx = arr.length - 1;
    while (-1 < idx) {
      tmp = arr[idx];
      arr[idx--] = rightMax;
      if (rightMax < tmp) {
        rightMax = tmp;
      }
    }
    return arr;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

