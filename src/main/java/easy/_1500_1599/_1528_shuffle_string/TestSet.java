package easy._1500_1599._1528_shuffle_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "codeleet";
    int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
    String result = "leetcode";
    String solution = new easy._1500_1599._1528_shuffle_string.Solution()
        .restoreString(s, indices);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "abc";
    int[] indices = {0, 1, 2};
    String result = "abc";
    String solution = new easy._1500_1599._1528_shuffle_string.Solution()
        .restoreString(s, indices);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "aiohn";
    int[] indices = {3, 1, 4, 2, 0};
    String result = "nihao";
    String solution = new easy._1500_1599._1528_shuffle_string.Solution()
        .restoreString(s, indices);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "aaiougrt";
    int[] indices = {4, 0, 2, 6, 7, 3, 1, 5};
    String result = "arigatou";
    String solution = new easy._1500_1599._1528_shuffle_string.Solution()
        .restoreString(s, indices);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "art";
    int[] indices = {1, 0, 2};
    String result = "rat";
    String solution = new easy._1500_1599._1528_shuffle_string.Solution()
        .restoreString(s, indices);
    Assert.assertTrue(result.equals(solution));
  }

}
