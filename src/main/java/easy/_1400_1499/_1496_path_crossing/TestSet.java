package easy._1400_1499._1496_path_crossing;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String path = "NES";
    Boolean result = false;
    boolean solution = new easy._1400_1499._1496_path_crossing.Solution()
        .isPathCrossing(path);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String path = "NESWW";
    Boolean result = true;
    boolean solution = new easy._1400_1499._1496_path_crossing.Solution()
        .isPathCrossing(path);
    Assert.assertTrue(result.equals(solution));
  }

}
