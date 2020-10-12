package easy._0200_0299._278_first_bad_version;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 2126753390;
    VersionControl.badVersion = 1702766719;
    Integer result = 1702766719;
    int resolution = new easy._0200_0299._278_first_bad_version.Solution().firstBadVersion(n);
    Assert.assertTrue(result.equals(resolution));
  }

}
