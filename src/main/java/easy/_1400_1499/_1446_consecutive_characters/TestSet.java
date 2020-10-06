package easy._1400_1499._1446_consecutive_characters;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "leetcode";
    Integer result = 2;
    int solution = new easy._1400_1499._1446_consecutive_characters.Solution()
        .maxPower(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "abbcccddddeeeeedcba";
    Integer result = 5;
    int solution = new easy._1400_1499._1446_consecutive_characters.Solution()
        .maxPower(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "triplepillooooow";
    Integer result = 5;
    int solution = new easy._1400_1499._1446_consecutive_characters.Solution()
        .maxPower(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "hooraaaaaaaaaaay";
    Integer result = 11;
    int solution = new easy._1400_1499._1446_consecutive_characters.Solution()
        .maxPower(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "tourist";
    Integer result = 1;
    int solution = new easy._1400_1499._1446_consecutive_characters.Solution()
        .maxPower(s);
    Assert.assertTrue(result.equals(solution));
  }

}
