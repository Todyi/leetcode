package medium._0100_0199._131_palindrome_partitioning;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String s, String[][] result) {
    List<List<String>> solution = new Solution()
        .partition(s);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      List<String> list = solution.get(i);
      String[] arr = new String[list.size()];
      list.toArray(arr);
      Assert.assertTrue(Comparators.isSame(result[i], arr));
    }
  }

  @Test
  public void test0() {
    String s = "aab";
    String[][] result = {{"aa", "b"}, {"a", "a", "b"}};
    assertTrue(s, result);
  }

  @Test
  public void test1() {
    String s = "a";
    String[][] result = {{"a"}};
    assertTrue(s, result);
  }

}
