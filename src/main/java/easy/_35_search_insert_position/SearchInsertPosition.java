package easy._35_search_insert_position;

/**
 * @program: leetcode
 * @description: 35.search-insert-position
 * @author: hdy
 * @create: 2019-04-24
 **/

public class SearchInsertPosition {

  /**
   * √ Accepted
   * √ 62/62 cases passed (0 ms)
   * √ Your runtime beats 100 % of java submissions
   * √ Your memory usage beats 5.03 % of java submissions (39.7 MB)
   */
  public static int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= target) {
        return i;
      }
    }
    return nums.length;
  }

}
