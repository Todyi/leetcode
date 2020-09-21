package easy._1100_1199._1128_number_of_domino_pairs;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
    Integer result = 1;
    int solution = new easy._1100_1199._1128_number_of_domino_pairs.Solution()
        .numEquivDominoPairs(dominoes);
    Assert.assertTrue(result.equals(solution));
  }

}
