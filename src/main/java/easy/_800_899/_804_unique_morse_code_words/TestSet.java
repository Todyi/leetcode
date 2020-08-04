package easy._800_899._804_unique_morse_code_words;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] words = {"gin", "zen", "gig", "msg"};
    Integer result = 2;
    int solution = new easy._800_899._804_unique_morse_code_words.Solution()
        .uniqueMorseRepresentations(words);
    Assert.assertTrue(result.equals(solution));
  }

}
