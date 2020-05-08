package easy._400_499._443_string_compression;


import common.Comparators;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {


  @Test
  public void test0() {
    char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    char[] result = {'a', '2', 'b', '2', 'c', '3'};
    int solution = new easy._400_499._443_string_compression.Solution().compress(chars);
    Assert.assertTrue(Comparators.isSame(result, Arrays.copyOf(chars, solution)));
  }

  @Test
  public void test1() {
    char[] chars = {'a'};
    char[] result = {'a'};
    int solution = new easy._400_499._443_string_compression.Solution().compress(chars);
    Assert.assertTrue(Comparators.isSame(result, Arrays.copyOf(chars, solution)));
  }

  @Test
  public void test2() {
    char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    char[] result = {'a', 'b', '1', '2'};
    int solution = new easy._400_499._443_string_compression.Solution().compress(chars);
    Assert.assertTrue(Comparators.isSame(result, Arrays.copyOf(chars, solution)));
  }

  @Test
  public void test3() {
    char[] chars = {'a','a','a','b','b','a','a'};
    char[] result = {'a','3','b','2','a','2'};
    int solution = new easy._400_499._443_string_compression.Solution().compress(chars);
    Assert.assertTrue(Comparators.isSame(result, Arrays.copyOf(chars, solution)));
  }

}
