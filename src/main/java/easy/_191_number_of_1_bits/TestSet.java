package easy._191_number_of_1_bits;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = -3;
    Integer result = 31;
    int resolution = new Solution().hammingWeight(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
