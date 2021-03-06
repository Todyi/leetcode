package medium._0000_0099._045_jump_game_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {2, 3, 1, 1, 4};
    Integer result = 2;
    int solution = new medium._0000_0099._045_jump_game_ii.Solution()
        .jump(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {2, 3, 0, 1, 4};
    Integer result = 2;
    int solution = new medium._0000_0099._045_jump_game_ii.Solution()
        .jump(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {8, 2, 4, 4, 4, 9, 5, 2, 5, 8, 8, 0, 8, 6, 9, 1, 1, 6, 3, 5, 1, 2, 6, 6, 0, 4, 8,
        6, 0, 3, 2, 8, 7, 6, 5, 1, 7, 0, 3, 4, 8, 3, 5, 9, 0, 4, 0, 1, 0, 5, 9, 2, 0, 7, 0, 2, 1, 0,
        8, 2, 5, 1, 2, 3, 9, 7, 4, 7, 0, 0, 1, 8, 5, 6, 7, 5, 1, 9, 9, 3, 5, 0, 7, 5};
    Integer result = 13;
    int solution = new medium._0000_0099._045_jump_game_ii.Solution()
        .jump(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
