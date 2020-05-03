package easy._200_299._283_move_zeroes;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {0,1,0,3,12};
    int[] result = {1,3,12,0,0};
    new easy._200_299._283_move_zeroes.Solution().moveZeroes(input);
    Assert.assertTrue(Comparators.isSame(result,input));
  }


  @Test
  public void test1() {
    int[] input = {0,0,0,3,12};
    int[] result = {3,12,0,0,0};
    new easy._200_299._283_move_zeroes.Solution().moveZeroes(input);
    Assert.assertTrue(Comparators.isSame(result,input));
  }

}
