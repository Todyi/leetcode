package easy._1000_1099._1002_find_common_characters;


import common.Comparators;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String[] a, String[] result) {
    List<String> solution = new Solution()
        .commonChars(a);
    Arrays.sort(result);
    String[] solutionArr = solution.toArray(new String[0]);
    Arrays.sort(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test0() {
    String[] A = {"bella", "label", "roller"};
    String[] result = {"e", "l", "l"};
    assertTrue(A, result);
  }

  @Test
  public void test1() {
    String[] A = {"cool", "lock", "cook"};
    String[] result = {"c", "o"};
    assertTrue(A, result);
  }

  @Test
  public void test2() {
    String[] A = {"acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda",
        "cababaab", "addcaccd"};
    String[] result = {};
    assertTrue(A, result);
  }

  @Test
  public void test3() {
    String[] A = {"bbddabab", "cbcddbdd", "bbcadcab", "dabcacad", "cddcacbc", "ccbdbcba",
        "cbddaccc", "accdcdbb"};
    String[] result = {"b", "d"};
    assertTrue(A, result);
  }


}
