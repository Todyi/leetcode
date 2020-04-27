package easy._1_200._66_plus_one;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public boolean equal(int[] arr0,int[] arr1){
    if (arr0.length == arr1.length){
      for (int i = 0; i < arr0.length; i++) {
        if (arr0[i] != arr1[i]){
          return false;
        }
      }
      return true;
    }
    return false;
  }

  @Test
  public void test() {
    int[] i = {1,2,3};
    int[] result = {1,2,4};
    Assert.assertTrue(equal(result, new Solution().plusOne(i)));
  }

  @Test
  public void test1() {
    int[] i = {9,9,9};
    int[] result = {1,0,0,0};
    Assert.assertTrue(equal(result, new Solution().plusOne(i)));
  }
}
