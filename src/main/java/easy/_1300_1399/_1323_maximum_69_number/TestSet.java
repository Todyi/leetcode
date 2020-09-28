package easy._1300_1399._1323_maximum_69_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num = 9669;
    Integer result = 9969;
    int solution = new easy._1300_1399._1323_maximum_69_number.Solution()
        .maximum69Number(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int num = 9996;
    Integer result = 9999;
    int solution = new easy._1300_1399._1323_maximum_69_number.Solution()
        .maximum69Number(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int num = 9999;
    Integer result = 9999;
    int solution = new easy._1300_1399._1323_maximum_69_number.Solution()
        .maximum69Number(num);
    Assert.assertTrue(result.equals(solution));
  }

}
