package medium._0000_0099._057_insert_interval;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] intervals = {{1, 3}, {6, 9}};
    int[] newInterval = {2, 5};
    int[][] result = {{1, 5}, {6, 9}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test1() {
    int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
    int[] newInterval = {4, 8};
    int[][] result = {{1, 2}, {3, 10}, {12, 16}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test2() {
    int[][] intervals = {};
    int[] newInterval = {5, 7};
    int[][] result = {{5, 7}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test3() {
    int[][] intervals = {{1, 5}};
    int[] newInterval = {2, 3};
    int[][] result = {{1, 5}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test4() {
    int[][] intervals = {{1, 5}};
    int[] newInterval = {2, 7};
    int[][] result = {{1, 7}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test5() {
    int[][] intervals = {{1, 5}};
    int[] newInterval = {0, 0};
    int[][] result = {{0, 0}, {1, 5}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test6() {
    int[][] intervals = {{1, 5}};
    int[] newInterval = {6, 8};
    int[][] result = {{1, 5}, {6, 8}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test7() {
    int[][] intervals = {{0, 2}, {3, 9}};
    int[] newInterval = {6, 8};
    int[][] result = {{0, 2}, {3, 9}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test8() {
    int[][] intervals = {{0, 2}, {3, 3}, {6, 11}};
    int[] newInterval = {9, 15};
    int[][] result = {{0, 2}, {3, 3}, {6, 15}};
    int[][] solution = new medium._0000_0099._057_insert_interval.Solution()
        .insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }
}
