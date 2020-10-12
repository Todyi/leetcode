package easy._0500_0599._599_minimum_index_sum_of_two_lists;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    String[] result = {"Shogun"};
    String[] solution = new easy._0500_0599._599_minimum_index_sum_of_two_lists.Solution()
        .findRestaurant(list1, list2);
    Assert.assertTrue(Comparators.isSame(result,solution));
  }

  @Test
  public void test1() {
    String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    String[] list2 = {"KFC", "Shogun", "Burger King"};
    String[] result = {"Shogun"};
    String[] solution = new easy._0500_0599._599_minimum_index_sum_of_two_lists.Solution()
        .findRestaurant(list1, list2);
    Assert.assertTrue(Comparators.isSame(result,solution));
  }

  @Test
  public void test2() {
    String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
    String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
    String[] result = {"Tapioca Express","Shogun","KFC","Burger King"};
    String[] solution = new easy._0500_0599._599_minimum_index_sum_of_two_lists.Solution()
        .findRestaurant(list1, list2);
    Assert.assertTrue(Comparators.isSame(result,solution));
  }

}
