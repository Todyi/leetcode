package easy._800_899._819_most_common_word;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = {"hit"};
    String result = "ball";
    String solution = new easy._800_899._819_most_common_word.Solution()
        .mostCommonWord(paragraph, banned);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String paragraph = "a.";
    String[] banned = {};
    String result = "a";
    String solution = new easy._800_899._819_most_common_word.Solution()
        .mostCommonWord(paragraph, banned);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String paragraph = "a, a, a, a, b,b,b,c, c";
    String[] banned = {"a"};
    String result = "b";
    String solution = new easy._800_899._819_most_common_word.Solution()
        .mostCommonWord(paragraph, banned);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String paragraph = "Bob";
    String[] banned = {};
    String result = "bob";
    String solution = new easy._800_899._819_most_common_word.Solution()
        .mostCommonWord(paragraph, banned);
    Assert.assertTrue(result.equals(solution));
  }

}
