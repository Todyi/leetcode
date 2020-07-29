package easy._700_799._771_jewels_and_stones;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String J= "aA";
    String S = "aAAbbbb";
    Integer result = 3;
    int solution = new easy._700_799._771_jewels_and_stones.Solution()
        .numJewelsInStones(J,S);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String J= "z";
    String S = "ZZ";
    Integer result = 0;
    int solution = new easy._700_799._771_jewels_and_stones.Solution()
        .numJewelsInStones(J,S);
    Assert.assertTrue(result.equals(solution));
  }

}
