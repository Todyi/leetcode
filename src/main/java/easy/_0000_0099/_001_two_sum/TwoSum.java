package easy._0000_0099._001_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description: 1.two-sum
 * @author: hdy
 * @create: 2019-04-23
 **/

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Integer> twiceMap = new HashMap<>();
    int i = 0;
    while (i < nums.length) {
      Integer twice = map.get(nums[i]);
      if (twice != null) {
        twiceMap.put(nums[i], i);
      } else {
        map.put(nums[i], i);
      }
      i++;
    }
    int[] result = null;
    for (int num : map.keySet()) {
      Integer twicePosition = twiceMap.get(target - num);
      if (twicePosition != null) {
        result = new int[]{map.get(num), twicePosition};
      } else {
        Integer position = map.get(target - num);
        if (position != null) {
          result = new int[]{map.get(num), position};
        }
      }
    }
    return result;
  }

  public static int[] anotherTwoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int sub = target - nums[i];
      if (map.containsKey(sub)) {
        return new int[]{i, map.get(sub)};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}
