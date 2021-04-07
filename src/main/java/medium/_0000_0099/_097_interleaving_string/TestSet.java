package medium._0000_0099._097_interleaving_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s1 = "aabcc";
    String s2 = "dbbca";
    String s3 = "aadbbcbcac";
    Boolean result = true;
    boolean solution = new medium._0000_0099._097_interleaving_string.Solution()
        .isInterleave(s1, s2, s3);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s1 = "aabcc";
    String s2 = "dbbca";
    String s3 = "aadbbbaccc";
    Boolean result = false;
    boolean solution = new medium._0000_0099._097_interleaving_string.Solution()
        .isInterleave(s1, s2, s3);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s1 = "";
    String s2 = "";
    String s3 = "";
    Boolean result = true;
    boolean solution = new medium._0000_0099._097_interleaving_string.Solution()
        .isInterleave(s1, s2, s3);
    Assert.assertTrue(result.equals(solution));
  }

}
