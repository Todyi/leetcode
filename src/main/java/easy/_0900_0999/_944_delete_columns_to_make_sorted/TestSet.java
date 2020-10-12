package easy._0900_0999._944_delete_columns_to_make_sorted;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] A = {"cba", "daf", "ghi"};
    Integer result = 1;
    int solution = new easy._0900_0999._944_delete_columns_to_make_sorted.Solution()
        .minDeletionSize(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String[] A = {"a","b"};
    Integer result = 0;
    int solution = new easy._0900_0999._944_delete_columns_to_make_sorted.Solution()
        .minDeletionSize(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String[] A = {"zyx","wvu","tsr"};
    Integer result = 3;
    int solution = new easy._0900_0999._944_delete_columns_to_make_sorted.Solution()
        .minDeletionSize(A);
    Assert.assertTrue(result.equals(solution));
  }

}
