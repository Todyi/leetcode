package easy._0100_0199._169_majority_element;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {3,2,3};
    Integer result = 3;
    int solution = new Solution().majorityElement(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] input = {2,2,1,1,1,2,2};
    Integer result = 2;
    int solution = new Solution().majorityElement(input);
    Assert.assertTrue(result.equals(solution));
  }

}
