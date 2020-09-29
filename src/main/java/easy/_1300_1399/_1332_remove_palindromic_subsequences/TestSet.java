package easy._1300_1399._1332_remove_palindromic_subsequences;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "ababa";
    Integer result = 1;
    int solution = new easy._1300_1399._1332_remove_palindromic_subsequences.Solution()
        .removePalindromeSub(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "abb";
    Integer result = 2;
    int solution = new easy._1300_1399._1332_remove_palindromic_subsequences.Solution()
        .removePalindromeSub(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "baabb";
    Integer result = 2;
    int solution = new easy._1300_1399._1332_remove_palindromic_subsequences.Solution()
        .removePalindromeSub(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "";
    Integer result = 0;
    int solution = new easy._1300_1399._1332_remove_palindromic_subsequences.Solution()
        .removePalindromeSub(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "bbaabaaa";
    Integer result = 2;
    int solution = new easy._1300_1399._1332_remove_palindromic_subsequences.Solution()
        .removePalindromeSub(s);
    Assert.assertTrue(result.equals(solution));
  }

}
