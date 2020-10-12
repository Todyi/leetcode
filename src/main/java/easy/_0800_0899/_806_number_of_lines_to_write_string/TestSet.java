package easy._0800_0899._806_number_of_lines_to_write_string;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
        10, 10, 10, 10, 10, 10};
    String S = "abcdefghijklmnopqrstuvwxyz";
    int[] result = {3, 60};
    int[] solution = new easy._0800_0899._806_number_of_lines_to_write_string.Solution()
        .numberOfLines(widths, S);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
        10, 10, 10, 10, 10, 10};
    String S = "bbbcccdddaaa";
    int[] result = {2, 4};
    int[] solution = new easy._0800_0899._806_number_of_lines_to_write_string.Solution()
        .numberOfLines(widths, S);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
