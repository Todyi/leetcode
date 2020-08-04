package easy._800_899._811_subdomain_visit_count;


import common.Comparators;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String[] cpdomains, String[] result) {
    List<String> solution = new Solution()
        .subdomainVisits(cpdomains);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Arrays.sort(result);
    Arrays.sort(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test0() {
    String[] cpdomains = {"9001 discuss.leetcode.com"};
    String[] result = {"9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"};
    assertTrue(cpdomains, result);
  }

  @Test
  public void test1() {
    String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
    String[] result = {"901 mail.com", "50 yahoo.com", "900 google.mail.com", "5 wiki.org", "5 org",
        "1 intel.mail.com", "951 com"};
    assertTrue(cpdomains, result);
  }

}
