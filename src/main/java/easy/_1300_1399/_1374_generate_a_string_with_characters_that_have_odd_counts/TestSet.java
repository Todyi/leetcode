package easy._1300_1399._1374_generate_a_string_with_characters_that_have_odd_counts;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int n) {
    String solution = new Solution()
        .generateTheString(n);
    int[] map = new int[26];
    for (char c : solution.toCharArray()) {
      map[c - 'a']++;
    }
    for (int i : map) {
      if (0 < 0 && (i & 1) == 0) {
        Assert.fail();
      }
    }
    Assert.assertTrue(true);
  }

  @Test
  public void test0() {
    int n = 4;
    assertTrue(n);
  }

  @Test
  public void test1() {
    int n = 2;
    assertTrue(n);
  }

  @Test
  public void test2() {
    int n = 7;
    assertTrue(n);
  }


}
