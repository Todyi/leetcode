package easy._1200_1299._1221_split_a_string_in_balanced_strings;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "RLRRLLRLRL";
    Integer result = 4;
    int solution = new easy._1200_1299._1221_split_a_string_in_balanced_strings.Solution()
        .balancedStringSplit(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "RLLLLRRRLR";
    Integer result = 3;
    int solution = new easy._1200_1299._1221_split_a_string_in_balanced_strings.Solution()
        .balancedStringSplit(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "LLLLRRRR";
    Integer result = 1;
    int solution = new easy._1200_1299._1221_split_a_string_in_balanced_strings.Solution()
        .balancedStringSplit(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "RLRRRLLRLL";
    Integer result = 2;
    int solution = new easy._1200_1299._1221_split_a_string_in_balanced_strings.Solution()
        .balancedStringSplit(s);
    Assert.assertTrue(result.equals(solution));
  }

}
