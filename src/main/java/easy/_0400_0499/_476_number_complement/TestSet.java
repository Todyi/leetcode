package easy._0400_0499._476_number_complement;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num = 5;
    Integer result = 2;
    int solution = new easy._0400_0499._476_number_complement.Solution()
        .findComplement(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int num = 1;
    Integer result = 0;
    int solution = new easy._0400_0499._476_number_complement.Solution()
        .findComplement(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int num = 3;
    Integer result = 0;
    int solution = new easy._0400_0499._476_number_complement.Solution()
        .findComplement(num);
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test3() {
    int num = 4; //0100->0011
    Integer result = 3;
    int solution = new easy._0400_0499._476_number_complement.Solution()
        .findComplement(num);
    Assert.assertTrue(result.equals(solution));
  }
}
