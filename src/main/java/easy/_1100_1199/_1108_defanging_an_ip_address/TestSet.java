package easy._1100_1199._1108_defanging_an_ip_address;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String address = "1.1.1.1";
    String result = "1[.]1[.]1[.]1";
    String solution = new easy._1100_1199._1108_defanging_an_ip_address.Solution()
        .defangIPaddr(address);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String address = "255.100.50.0";
    String result = "255[.]100[.]50[.]0";
    String solution = new easy._1100_1199._1108_defanging_an_ip_address.Solution()
        .defangIPaddr(address);
    Assert.assertTrue(result.equals(solution));
  }

}
