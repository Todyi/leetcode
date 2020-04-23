package easy._136_single_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {2,2,1};
    Integer result = 1;
    int solution = new easy._136_single_number.Solution().singleNumber(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] input = {4,1,2,1,2};
    Integer result = 4;
    int solution = new easy._136_single_number.Solution().singleNumber(input);
    Assert.assertTrue(result.equals(solution));
  }

}
