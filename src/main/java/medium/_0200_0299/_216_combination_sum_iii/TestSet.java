package medium._0200_0299._216_combination_sum_iii;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int k = 3;
    int n = 7;
    Integer[][] result = {{1, 2, 4}};
    List<List<Integer>> solution = new medium._0200_0299._216_combination_sum_iii.Solution()
        .combinationSum3(k, n);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        Assert.assertTrue(result[i][j] == solution.get(i).get(j));
      }
    }
  }

  @Test
  public void test1() {
    int k = 3;
    int n = 9;
    Integer[][] result = {{1, 2, 6}, {1, 3, 5}, {2, 3, 4}};
    List<List<Integer>> solution = new medium._0200_0299._216_combination_sum_iii.Solution()
        .combinationSum3(k, n);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        Assert.assertTrue(result[i][j] == solution.get(i).get(j));
      }
    }
  }

  @Test
  public void test2() {
    int k = 4;
    int n = 1;
    Integer[][] result = {};
    List<List<Integer>> solution = new medium._0200_0299._216_combination_sum_iii.Solution()
        .combinationSum3(k, n);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        Assert.assertTrue(result[i][j] == solution.get(i).get(j));
      }
    }
  }

  @Test
  public void test3() {
    int k = 3;
    int n = 2;
    Integer[][] result = {};
    List<List<Integer>> solution = new medium._0200_0299._216_combination_sum_iii.Solution()
        .combinationSum3(k, n);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        Assert.assertTrue(result[i][j] == solution.get(i).get(j));
      }
    }
  }

  @Test
  public void test4() {
    int k = 9;
    int n = 45;
    Integer[][] result = {{1, 2, 3, 4, 5, 6, 7, 8, 9}};
    List<List<Integer>> solution = new medium._0200_0299._216_combination_sum_iii.Solution()
        .combinationSum3(k, n);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        Assert.assertTrue(result[i][j] == solution.get(i).get(j));
      }
    }
  }


}
