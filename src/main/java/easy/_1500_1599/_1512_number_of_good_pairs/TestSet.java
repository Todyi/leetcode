package easy._1500_1599._1512_number_of_good_pairs;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1,2,3,1,1,3};
    Integer result = 4;
    int solution = new easy._1500_1599._1512_number_of_good_pairs.Solution()
        .numIdenticalPairs(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1,1,1,1};
    Integer result = 6;
    int solution = new easy._1500_1599._1512_number_of_good_pairs.Solution()
        .numIdenticalPairs(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1,2,3};
    Integer result = 0;
    int solution = new easy._1500_1599._1512_number_of_good_pairs.Solution()
        .numIdenticalPairs(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
