package medium._0000_0099._049_group_anagrams;


import common.Comparators;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String[] strs, HashMap<Integer, Integer> result) {
    List<List<String>> solution = new Solution()
        .groupAnagrams(strs);
    for (List<String> list : solution) {
      if (!result.containsKey(list.size())) {
        Assert.fail();
      } else {
        int n = result.get(list.size()) - 1;
        if (0 < n) {
          result.put(list.size(), n);
        } else {
          result.remove(list.size());
        }
      }
      int[] map = new int[26];
      char[] arr = list.get(0).toCharArray();
      for (char c : arr) {
        map[c - 'a']++;
      }
      for (int i = 1; i < list.size(); i++) {
        int[] tmp = new int[26];
        char[] tmpArr = list.get(i).toCharArray();
        for (char c : tmpArr) {
          tmp[c - 'a']++;
        }
        Assert.assertTrue(Comparators.isSame(map, tmp));
      }
    }
    Assert.assertTrue(result.size() == 0);
  }

  @Test
  public void test0() {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    HashMap<Integer, Integer> result = new HashMap<>();
    result.put(1,1);
    result.put(2,1);
    result.put(3,1);
    assertTrue(strs, result);
  }

  @Test
  public void test1() {
    String[] strs = {""};
    HashMap<Integer, Integer> result = new HashMap<>();
    result.put(1,1);
    assertTrue(strs, result);
  }

  @Test
  public void test2() {
    String[] strs = {"a"};
    HashMap<Integer, Integer> result = new HashMap<>();
    result.put(1,1);
    assertTrue(strs, result);
  }

  @Test
  public void test3() {
    String[] strs = {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
    HashMap<Integer, Integer> result = new HashMap<>();
    result.put(1, 2);
    assertTrue(strs, result);
  }


}
