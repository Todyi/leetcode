package easy._400_499._453_minimum_moves_to_equal_array_elements;

//Given a non-empty integer array of size n, find the minimum number of moves required
// to make all array elements equal, where a move is incrementing n - 1 elements by 1.
//
// Example:
//
//Input:
//[1,2,3]
//
//Output:
//3
//
//Explanation:
//Only three moves are needed (remember each move increments two elements):
//
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
//
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.9 MB,击败了100.00% 的Java用户
  public int minMoves(int[] nums) {
    //moves:x ,equalVal:y
    //(n-1)*x+∑nums == n*y
    //y-min(nums) = x => y = min(nums)+x
    //(n-1)*x + ∑nums = n*min(nums)+n*x => x =∑nums- n*min(nums)
    int n = nums.length;
    int min = Integer.MAX_VALUE;
    long sum = 0;
    for (int num : nums) {
      if (num < min) {
        min = num;
      }
      sum += num;
    }

    return (int) (sum - n * min);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

