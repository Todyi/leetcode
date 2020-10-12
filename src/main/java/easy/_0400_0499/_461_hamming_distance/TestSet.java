package easy._0400_0499._461_hamming_distance;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int g = 1;
    int s = 4;
    Integer result = 2;
    int solution = new easy._0400_0499._461_hamming_distance.Solution()
        .hammingDistance(g, s);
    Assert.assertTrue(result.equals(solution));
  }

}
