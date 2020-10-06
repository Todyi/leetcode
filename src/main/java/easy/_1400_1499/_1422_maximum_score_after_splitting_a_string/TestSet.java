package easy._1400_1499._1422_maximum_score_after_splitting_a_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "011101";
    Integer result = 5;
    int solution = new easy._1400_1499._1422_maximum_score_after_splitting_a_string.Solution()
        .maxScore(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "00111";
    Integer result = 5;
    int solution = new easy._1400_1499._1422_maximum_score_after_splitting_a_string.Solution()
        .maxScore(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "1111";
    Integer result = 3;
    int solution = new easy._1400_1499._1422_maximum_score_after_splitting_a_string.Solution()
        .maxScore(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "00";
    Integer result = 1;
    int solution = new easy._1400_1499._1422_maximum_score_after_splitting_a_string.Solution()
        .maxScore(s);
    Assert.assertTrue(result.equals(solution));
  }

}
