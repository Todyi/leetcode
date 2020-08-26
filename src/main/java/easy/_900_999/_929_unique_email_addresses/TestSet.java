package easy._900_999._929_unique_email_addresses;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
        "testemail+david@lee.tcode.com"};
    Integer result = 2;
    int solution = new easy._900_999._929_unique_email_addresses.Solution()
        .numUniqueEmails(emails);
    Assert.assertTrue(result.equals(solution));
  }

}
