package easy._201_400._292_nim_game;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 4;
    Boolean result = false;
    boolean resolution = new easy._201_400._292_nim_game.Solution().canWinNim(input);
    Assert.assertTrue(result.equals(resolution));
  }


}
