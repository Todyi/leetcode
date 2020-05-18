package easy._500_599._599_minimum_index_sum_of_two_lists;

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
  //  执行耗时:10 ms,击败了36.92% 的Java用户
  //  内存消耗:40.1 MB,击败了45.16% 的Java用户
  public String[] findRestaurant(String[] list1, String[] list2) {
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < list1.length; i++) {
      map.put(list1[i], Integer.MAX_VALUE - 1000 + i);
    }

    for (int i = 0; i < list2.length; i++) {
      if (map.containsKey(list2[i])) {
        map.put(list2[i], map.get(list2[i]) + 1000 - Integer.MAX_VALUE + i);
      }
    }
    int minValue = Integer.MAX_VALUE;
    List<String> list = new ArrayList<>();
    for (String s : map.keySet()) {
      int value = map.get(s);
      if (value == minValue) {
        list.add(s);
      } else if (value < minValue) {
        list.clear();
        list.add(s);
        minValue = value;
      }
    }
    String[] res = new String[list.size()];
    list.toArray(res);
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

