package medium._0000_0099._055_jump_game;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {2, 3, 1, 1, 4};
    Boolean result = true;
    boolean solution = new medium._0000_0099._055_jump_game.Solution()
        .canJump(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {3, 2, 1, 0, 4};
    Boolean result = false;
    boolean solution = new medium._0000_0099._055_jump_game.Solution()
        .canJump(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {0};
    Boolean result = true;
    boolean solution = new medium._0000_0099._055_jump_game.Solution()
        .canJump(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {2, 5, 0, 0};
    Boolean result = true;
    boolean solution = new medium._0000_0099._055_jump_game.Solution()
        .canJump(nums);
    Assert.assertTrue(result.equals(solution));
  }
}
