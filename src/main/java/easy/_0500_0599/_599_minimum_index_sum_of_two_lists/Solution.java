package easy._0500_0599._599_minimum_index_sum_of_two_lists;

//
//Suppose Andy and Doris want to choose a restaurant for dinner,
// and they both have a list of favorite restaurants represented by strings.
//
//
//You need to help them find out their common interest with the least list index sum.
// If there is a choice tie between answers,
// output all of them with no order requirement.
// You could assume there always exists an answer.
//
//
//
// Example 1:
//
//Input:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
//Output: ["Shogun"]
//Explanation: The only restaurant they both like is "Shogun".
//
//
//
// Example 2:
//
//Input:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["KFC", "Shogun", "Burger King"]
//Output: ["Shogun"]
//Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
//
//
//
//
// Note:
//
// The length of both lists will be in the range of [1, 1000].
// The length of strings in both lists will be in the range of [1, 30].
// The index is starting from 0 to the list length minus 1.
// No duplicates in both lists.
//
// Related Topics Hash Table


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了93.55% 的Java用户
  public String[] findRestaurant(String[] list1, String[] list2) {
    if (list1.length > list2.length) {
      return findRestaurant(list2, list1);
    }

    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < list1.length; i++) {
      map.put(list1[i], i);
    }

    int minValue = Integer.MAX_VALUE;
    List<String> list = new ArrayList<>();
    for (int i = 0; i < list2.length && i <= minValue; i++) {
      if (map.containsKey(list2[i])) {
        int value = map.get(list2[i]) + i;
        if (minValue < value) {
          continue;
        }
        if (value < minValue) {
          list.clear();
        }
        minValue = value;
        list.add(list2[i]);
      }
    }
    return list.toArray(new String[0]);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

