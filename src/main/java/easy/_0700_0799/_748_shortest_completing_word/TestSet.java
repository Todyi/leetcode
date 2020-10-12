package easy._0700_0799._748_shortest_completing_word;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String licensePlate = "1s3 PSt";
    String[] words = {"step", "steps", "stripe", "stepple"};
    String result = "steps";
    String solution = new easy._0700_0799._748_shortest_completing_word.Solution()
        .shortestCompletingWord(licensePlate, words);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String licensePlate = "1s3 456";
    String[] words = {"looks", "pest", "stew", "show"};
    String result = "pest";
    String solution = new easy._0700_0799._748_shortest_completing_word.Solution()
        .shortestCompletingWord(licensePlate, words);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String licensePlate = "Ah71752";
    String[] words = {"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent",
        "writer", "old"};
    String result = "husband";
    String solution = new easy._0700_0799._748_shortest_completing_word.Solution()
        .shortestCompletingWord(licensePlate, words);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String licensePlate = "iMSlpe4";
    String[] words = {"claim", "consumer", "student", "camera", "public", "never", "wonder",
        "simple", "thought", "use"};
    String result = "simple";
    String solution = new easy._0700_0799._748_shortest_completing_word.Solution()
        .shortestCompletingWord(licensePlate, words);
    Assert.assertTrue(result.equals(solution));
  }


}
