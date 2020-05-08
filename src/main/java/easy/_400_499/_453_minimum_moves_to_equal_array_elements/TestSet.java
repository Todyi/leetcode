package easy._400_499._453_minimum_moves_to_equal_array_elements;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3};
    Integer result = 3;
    int solution = new easy._400_499._453_minimum_moves_to_equal_array_elements.Solution()
        .minMoves(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 3, 4};//2344,3445,4555,5566,6667,7777
    Integer result = 6;
    int solution = new easy._400_499._453_minimum_moves_to_equal_array_elements.Solution()
        .minMoves(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, 4};//24,34,44
    Integer result = 3;
    int solution = new easy._400_499._453_minimum_moves_to_equal_array_elements.Solution()
        .minMoves(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {1, 1, 2147483647};
    Integer result = 2147483646;
    int solution = new easy._400_499._453_minimum_moves_to_equal_array_elements.Solution()
        .minMoves(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {5, 6, 8, 8, 5};//55688:66789,77899,8899a,99aaa,aaabb,bbbbc,ccccc
    Integer result = 7;
    int solution = new easy._400_499._453_minimum_moves_to_equal_array_elements.Solution()
        .minMoves(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {1, 4, 4};//245,355,456,566,667,777
    Integer result = 6;
    int solution = new easy._400_499._453_minimum_moves_to_equal_array_elements.Solution()
        .minMoves(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int[] nums = {83, 86, 77, 15, 93, 35, 86, 92, 49, 21};
    Integer result = 487;
    int solution = new easy._400_499._453_minimum_moves_to_equal_array_elements.Solution()
        .minMoves(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
