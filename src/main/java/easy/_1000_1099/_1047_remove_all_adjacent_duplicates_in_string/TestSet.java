package easy._1000_1099._1047_remove_all_adjacent_duplicates_in_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String S = "abbaca";
    String result = "ca";
    String solution = new easy._1000_1099._1047_remove_all_adjacent_duplicates_in_string.Solution()
        .removeDuplicates(S);
    Assert.assertTrue(result.equals(solution));
  }

}
