package medium._0000_0099._056_merge_intervals;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    int[][] result = {{1, 6}, {8, 10}, {15, 18}};
    int[][] solution = new medium._0000_0099._056_merge_intervals.Solution()
        .merge(intervals);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test1() {
    int[][] intervals = {{1, 4}, {4, 5}};
    int[][] result = {{1, 5}};
    int[][] solution = new medium._0000_0099._056_merge_intervals.Solution()
        .merge(intervals);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test2() {
    int[][] intervals = {};
    int[][] result = {};
    int[][] solution = new medium._0000_0099._056_merge_intervals.Solution()
        .merge(intervals);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test3() {
    int[][] intervals = {{1, 4}, {0, 4}};
    int[][] result = {{0, 4}};
    int[][] solution = new medium._0000_0099._056_merge_intervals.Solution()
        .merge(intervals);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test4() {
    int[][] intervals = {{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4, 6}};
    int[][] result = {{1, 3}, {4, 7}};
    int[][] solution = new medium._0000_0099._056_merge_intervals.Solution()
        .merge(intervals);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }
}
