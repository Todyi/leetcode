package easy._800_899._868_binary_gap;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int N = 22;
    Integer result = 2;
    int solution = new easy._800_899._868_binary_gap.Solution()
        .binaryGap(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int N = 5;
    Integer result = 2;
    int solution = new easy._800_899._868_binary_gap.Solution()
        .binaryGap(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int N = 6;
    Integer result = 1;
    int solution = new easy._800_899._868_binary_gap.Solution()
        .binaryGap(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int N = 8;
    Integer result = 0;
    int solution = new easy._800_899._868_binary_gap.Solution()
        .binaryGap(N);
    Assert.assertTrue(result.equals(solution));
  }

}
