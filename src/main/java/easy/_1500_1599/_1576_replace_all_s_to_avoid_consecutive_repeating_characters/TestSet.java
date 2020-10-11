package easy._1500_1599._1576_replace_all_s_to_avoid_consecutive_repeating_characters;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String s) {
    String solution = new Solution()
        .modifyString(s);
    char[] arr = solution.toCharArray();
    for (int i = 1; i < arr.length; i++) {
      if (!Character.isLetter(arr[i]) || arr[i] == arr[i - 1]) {
        Assert.fail();
      }

    }
    Assert.assertTrue(true);
  }

  @Test
  public void test0() {
    String s = "?zs";
    assertTrue(s);
  }

  @Test
  public void test1() {
    String s = "ubv?w";
    assertTrue(s);
  }

  @Test
  public void test2() {
    String s = "j?qg??b";
    assertTrue(s);
  }

  @Test
  public void test3() {
    String s = "??yw?ipkj?";
    assertTrue(s);
  }

  @Test
  public void test4() {
    String s = "b?a";
    assertTrue(s);
  }

  @Test
  public void test5() {
    String s = "a?z";
    assertTrue(s);
  }

  @Test
  public void test6() {
    String s = "?zs";
    assertTrue(s);
  }

}
