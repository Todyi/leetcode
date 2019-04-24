package _27_remove_element;

/**
 * @program: leetcode
 * @description: 27.remove-element
 * @author: hdy
 * @create: 2019-04-24
 **/

public class RemoveElement {

  /**
   * √ Accepted
   * √ 113/113 cases passed (0 ms)
   * √ Your runtime beats 100 % of java submissions
   * √ Your memory usage beats 95.09 % of java submissions (37.4 MB)
   */
  public static int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }

    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[i] == val) {
        if (nums[j] != val) {
          nums[i] = nums[j];
          nums[j] = val;
        } else {
          i--;
        }
      }
      i++;
    }
    return i;
  }

  /**
   * √ Accepted
   * √ 113/113 cases passed (0 ms)
   * √ Your runtime beats 100 % of java submissions
   * √ Your memory usage beats 94.58 % of java submissions (37.4 MB)
   */
  public static int anotherSolution(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }

  /**
   * √ Accepted
   * √ 113/113 cases passed (0 ms)
   * √ Your runtime beats 100 % of java submissions
   * √ Your memory usage beats 96.63 % of java submissions (37.3 MB)
   *
   * remove are rare
   */
  public static int anAnotherSolution(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
      if (nums[i] == val) {
        nums[i] = nums[n - 1];
        n--;
      } else {
        i++;
      }
    }
    return i;
  }


}
