package easy._88_merge_sorted_array;


import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public boolean checkEquals(int[] result, int[] nums1) {
    if (result != null && nums1 != null) {
      if (result.length != nums1.length) {
        return false;
      }
      for (int i = 0; i < nums1.length; i++) {
        if (result[i] != nums1[i]) {
          return false;
        }
      }
      return true;
    }
    if (result == null && nums1 != null) {
      return false;
    }
    if (result != null && nums1 == null) {
      return false;
    }
    return true;
  }

  @Test
  public void test() {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;
    int[] result = {1, 2, 2, 3, 5, 6};
    new easy._88_merge_sorted_array.Solution().merge(nums1, m, nums2, n);
    Assert.assertTrue(checkEquals(result, nums1));
  }

  @Test
  public void test1() {
    int[] nums1 = {2, 0};
    int m = 1;
    int[] nums2 = {1};
    int n = 1;
    int[] result = {1, 2};
    new easy._88_merge_sorted_array.Solution().merge(nums1, m, nums2, n);
    Assert.assertTrue(checkEquals(result, nums1));
  }

  @Test
  public void test2() {
    int[] nums1 = {-2, 0, 0};
    int m = 1;
    int[] nums2 = {1, 3};
    int n = 2;
    int[] result = {-2, 1, 3};
    new easy._88_merge_sorted_array.Solution().merge(nums1, m, nums2, n);
    Assert.assertTrue(checkEquals(result, nums1));
  }

  @Test
  public void test3() {
    int[] nums1 = {-2, 0, 1, 0, 0};
    int m = 3;
    int[] nums2 = {1, 3};
    int n = 2;
    int[] result = {-2, 0, 1, 1, 3};
    new easy._88_merge_sorted_array.Solution().merge(nums1, m, nums2, n);
    Assert.assertTrue(checkEquals(result, nums1));
  }

  @Test
  public void test4() {
    int[] nums1 = {1, 3 ,0, 0, 0};
    int m = 2;
    int[] nums2 = {-2, 0, 1,};
    int n = 3;
    int[] result = {-2, 0, 1, 1, 3};
    new easy._88_merge_sorted_array.Solution().merge(nums1, m, nums2, n);
    Assert.assertTrue(checkEquals(result, nums1));
  }
}
