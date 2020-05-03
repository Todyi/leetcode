package easy._201_400._268_missing_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {3,0,1};
    Integer result = 2;
    int resolution = new easy._201_400._268_missing_number.Solution().missingNumber(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int[] input = {9,6,4,2,3,5,7,0,1};
    Integer result = 8;
    int resolution = new easy._201_400._268_missing_number.Solution().missingNumber(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int[] input = {0};
    Integer result = 1;
    int resolution = new easy._201_400._268_missing_number.Solution().missingNumber(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
