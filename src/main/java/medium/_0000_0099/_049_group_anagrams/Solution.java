package medium._0000_0099._049_group_anagrams;

//Given an array of strings strs, group the anagrams together.
// You can return the answer in any order.
//
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
//
//
// Example 1:
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:
// Input: strs = [""]
//Output: [[""]]
// Example 3:
// Input: strs = ["a"]
//Output: [["a"]]
//
//
// Constraints:
//
//
// 1 <= strs.length <= 104
// 0 <= strs[i].length <= 100
// strs[i] consists of lower-case English letters.
//
// Related Topics Hash Table String
// 👍 4288 👎 205


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 5 ms, faster than 98.76% of Java online submissions for Group Anagrams.
  //  Memory Usage: 47.5 MB, less than 11.49% of Java online submissions for Group Anagrams.
//  class Node {
//
//    Node[] map;
//    List<String> list;
//
//    public Node() {
//      map = new Node[26];
//    }
//  }
//
//
//  public List<List<String>> groupAnagrams(String[] strs) {
//    List<List<String>> res = new ArrayList<>();
//    Node map = new Node();
//    for (String s : strs) {
//      char[] arr = s.toCharArray();
//      Arrays.sort(arr);
//      match(res, map, s, arr, 0);
//    }
//    return res;
//  }
//
//  public void match(List<List<String>> res, Node map, String s, char[] arr, int idx) {
//    if (idx == arr.length) {
//      if (map.list == null) {
//        map.list = new ArrayList<>();
//        res.add(map.list);
//      }
//      map.list.add(s);
//      return;
//    }
//    int n = arr[idx] - 'a';
//    if (map.map[n] == null) {
//      map.map[n] = new Node();
//    }
//    match(res, map.map[n], s, arr, idx + 1);
//  }

  //  解答成功:
  //  执行耗时:3 ms,击败了100.00% 的Java用户
  //  内存消耗:42 MB,击败了11.49% 的Java用户
  int[] prime = {
      2, 3, 5, 7, 11, 13, 17,
      19, 23, 29, 31, 37, 41, 43,
      47, 53, 59, 61, 67, 71,
      73, 79, 83, 89, 97, 101
  };
  HashMap<Long, List<String>> map = new HashMap<>();

  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> res = new ArrayList<>();
    for (String s : strs) {
      match(res, s);
    }
    return res;
  }

  public void match(List<List<String>> res, String s) {
    long hash = 1;
    char[] arr = s.toCharArray();
    for (char c : arr) {
      hash *= prime[c - 'a'];
    }
    if (!map.containsKey(hash)) {
      List<String> list = new ArrayList<>();
      map.put(hash, list);
      res.add(list);
    }
    map.get(hash).add(s);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

