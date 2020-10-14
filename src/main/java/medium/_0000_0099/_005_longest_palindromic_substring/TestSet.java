package medium._0000_0099._005_longest_palindromic_substring;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String s, int size) {
    String solution = new Solution()
        .longestPalindrome(s);
    if (solution.length() < size) {
      Assert.fail();
    }
    char[] arr = solution.toCharArray();
    int len = arr.length, mid = len / 2, end = len - 1;
    for (int i = 0; i < mid; i++) {
      if (arr[i] != arr[end - i]) {
        Assert.fail();
      }
    }
  }

  @Test
  public void test0() {
    String s = "babad";
    assertTrue(s, 3);
  }

  @Test
  public void test1() {
    String s = "cbbd";
    assertTrue(s, 2);
  }

  @Test
  public void test2() {
    String s = "a";
    assertTrue(s, 1);
  }

  @Test
  public void test3() {
    String s = "ac";
    assertTrue(s, 1);
  }

  @Test
  public void test4() {
    String s = "bb";
    assertTrue(s, 2);
  }

  @Test
  public void test5() {
    String s = "babad";
    assertTrue(s, 3);
  }

}
