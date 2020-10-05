package easy._1300_1399._1399_count_largest_group;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 13;
    Integer result = 4;
    int solution = new easy._1300_1399._1399_count_largest_group.Solution()
        .countLargestGroup(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 2;
    Integer result = 2;
    int solution = new easy._1300_1399._1399_count_largest_group.Solution()
        .countLargestGroup(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 15;
    Integer result = 6;
    int solution = new easy._1300_1399._1399_count_largest_group.Solution()
        .countLargestGroup(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int n = 24;
    Integer result = 5;
    int solution = new easy._1300_1399._1399_count_largest_group.Solution()
        .countLargestGroup(n);
    Assert.assertTrue(result.equals(solution));
  }

}
