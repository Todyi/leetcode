package easy._600_699._657_robot_return_to_origin;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String moves = "UD";
    Boolean result = true;
    boolean solution = new easy._600_699._657_robot_return_to_origin.Solution()
        .judgeCircle(moves);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String moves = "LL";
    Boolean result = false;
    boolean solution = new easy._600_699._657_robot_return_to_origin.Solution()
        .judgeCircle(moves);
    Assert.assertTrue(result.equals(solution));
  }

}
