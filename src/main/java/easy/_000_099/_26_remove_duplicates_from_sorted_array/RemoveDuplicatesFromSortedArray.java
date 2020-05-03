package easy._000_099._26_remove_duplicates_from_sorted_array;

/**
 * @program: leetcode
 * @description: 26.remove-duplicates-from-sorted-array
 * @author: hdy
 * @create: 2019-04-24
 **/

public class RemoveDuplicatesFromSortedArray {

  /**
   * √ Accepted
   * √ 161/161 cases passed (1 ms)
   * √ Your runtime beats 99.98 % of java submissions
   * √ Your memory usage beats 34.29 % of java submissions (42.2 MB)
   */
  public static int removeDuplicates(int[] nums) {
    int count = 0;
    if (nums == null || nums.length == 0) {
      return count;
    }
    count++;
    int[] result = new int[nums.length];
    result[0] = nums[0];
    int position = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        count++;
        result[position] = nums[i + 1];
        position++;
      }
    }
    for (int j = 0; j < result.length; j++) {
      nums[j] = result[j];
    }

    return count;
  }

  /**
   * √ Accepted
   * √ 161/161 cases passed (1 ms)
   * √ Your runtime beats 99.98 % of java submissions
   * √ Your memory usage beats 85.07 % of java submissions (40.7 MB)
   *
   * i j
   * 0 0 1 2 2 3 4
   * i   j              i j
   * 0 0 1 2 2 3 4 -> 0 1 1 2 2 3 4
   *   i   j              i j
   * 0 1 1 2 2 3 4 -> 0 1 2 2 2 3 4
   *     i   j
   * 0 1 2 2 2 3 4
   *     i     j            i   j
   * 0 1 2 2 2 3 4 -> 0 1 2 3 2 3 4
   *       i     j            i   j
   * 0 1 2 3 2 3 4 -> 0 1 2 3 4 3 4
   */
  public static int anotherSolution(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }
}
