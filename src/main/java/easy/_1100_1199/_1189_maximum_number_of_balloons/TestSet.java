package easy._1100_1199._1189_maximum_number_of_balloons;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String text = "nlaebolko";
    Integer result = 1;
    int solution = new easy._1100_1199._1189_maximum_number_of_balloons.Solution()
        .maxNumberOfBalloons(text);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String text = "loonbalxballpoon";
    Integer result = 2;
    int solution = new easy._1100_1199._1189_maximum_number_of_balloons.Solution()
        .maxNumberOfBalloons(text);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String text = "leetcode";
    Integer result = 0;
    int solution = new easy._1100_1199._1189_maximum_number_of_balloons.Solution()
        .maxNumberOfBalloons(text);
    Assert.assertTrue(result.equals(solution));
  }

}
