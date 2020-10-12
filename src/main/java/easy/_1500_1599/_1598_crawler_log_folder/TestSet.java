package easy._1500_1599._1598_crawler_log_folder;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
    Integer result = 2;
    int solution = new easy._1500_1599._1598_crawler_log_folder.Solution()
        .minOperations(logs);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String[] logs = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
    Integer result = 3;
    int solution = new easy._1500_1599._1598_crawler_log_folder.Solution()
        .minOperations(logs);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String[] logs = {"d1/", "../", "../", "../"};
    Integer result = 0;
    int solution = new easy._1500_1599._1598_crawler_log_folder.Solution()
        .minOperations(logs);
    Assert.assertTrue(result.equals(solution));
  }


}
