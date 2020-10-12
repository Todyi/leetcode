package easy._0700_0799._703_kth_largest_ellement_in_a_stream;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int k = 3;
    int[] arr = {4, 5, 8, 2};
    KthLargest kthLargest = new KthLargest(k, arr);
    StringBuilder solution = new StringBuilder();
    solution.append(kthLargest.add(3));
    solution.append(kthLargest.add(5));
    solution.append(kthLargest.add(10));
    solution.append(kthLargest.add(9));
    solution.append(kthLargest.add(4));
    String result = "45588";
    Assert.assertTrue(result.equals(solution.toString()));
  }

  @Test
  public void test1() {
    int k = 1;
    int[] arr = {};
    KthLargest kthLargest = new KthLargest(k, arr);
    StringBuilder solution = new StringBuilder();
    solution.append(kthLargest.add(-3));
    solution.append(kthLargest.add(-2));
    solution.append(kthLargest.add(-4));
    solution.append(kthLargest.add(0));
    solution.append(kthLargest.add(-4));
    String result = "-3-2-200";
    Assert.assertTrue(result.equals(solution.toString()));
  }

  @Test
  public void test2() {
    int k = 2;
    int[] arr = {0};
    KthLargest kthLargest = new KthLargest(k, arr);
    StringBuilder solution = new StringBuilder();
    solution.append(kthLargest.add(-1));
    solution.append(kthLargest.add(1));
    solution.append(kthLargest.add(-2));
    solution.append(kthLargest.add(-4));
    solution.append(kthLargest.add(4));
    String result = "-10001";
    Assert.assertTrue(result.equals(solution.toString()));
  }

}
