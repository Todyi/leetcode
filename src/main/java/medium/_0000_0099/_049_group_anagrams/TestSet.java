package medium._0000_0099._049_group_anagrams;


import common.Comparators;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String[] strs, Set<Integer> result) {
    List<List<String>> solution = new Solution()
        .groupAnagrams(strs);
    for (List<String> list : solution) {
      if (!result.contains(list.size())) {
        Assert.fail();
      } else {
        result.remove(list.size());
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
    Set<Integer> result = new HashSet<>();
    result.add(1);
    result.add(2);
    result.add(3);
    assertTrue(strs, result);
  }

  @Test
  public void test1() {
    String[] strs = {""};
    Set<Integer> result = new HashSet<>();
    result.add(1);
    assertTrue(strs, result);
  }

  @Test
  public void test2() {
    String[] strs = {"a"};
    Set<Integer> result = new HashSet<>();
    result.add(1);
    assertTrue(strs, result);
  }


}
