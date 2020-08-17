package easy._800_899._860_lemonade_change;

//At a lemonade stand, each lemonade costs $5.
//
// Customers are standing in a queue to buy from you,
// and order one at a time (in the order specified by bills).
//
// Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
// You must provide the correct change to each customer,
// so that the net transaction is that the customer pays $5.
//
// Note that you don't have any change in hand at first.
//
// Return true if and only if you can provide every customer with correct change
//.
//
//
//
//
// Example 1:
//
//
//Input: [5,5,5,10,20]
//Output: true
//Explanation:
//From the first 3 customers, we collect three $5 bills in order.
//From the fourth customer, we collect a $10 bill and give back a $5.
//From the fifth customer, we give a $10 bill and a $5 bill.
//Since all customers got correct change, we output true.
//
//
//
// Example 2:
//
//
//Input: [5,5,10]
//Output: true
//
//
//
// Example 3:
//
//
//Input: [10,10]
//Output: false
//
//
//
// Example 4:
//
//
//Input: [5,5,10,10,20]
//Output: false
//Explanation:
//From the first two customers in order, we collect two $5 bills.
//For the next two customers in order, we collect a $10 bill and give back a $5
//bill.
//For the last customer, we can't give change of $15 back because we only have t
//wo $10 bills.
//Since not every customer received correct change, the answer is false.
//
//
//
//
// Note:
//
//
// 0 <= bills.length <= 10000
// bills[i] will be either 5, 10, or 20.
//
//
//
//
//
// Related Topics Greedy
// 👍 621 👎 79


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.5 MB,击败了69.72% 的Java用户
  public boolean lemonadeChange(int[] bills) {
    int five = 0, ten = 0;

    for (int i = 0; i < bills.length; i++) {
      if (bills[i] == 5) {
        five++;
      } else if (bills[i] == 10) {
        if (five == 0) {
          return false;
        }
        five--;
        ten++;
      } else {
        if (ten == 0) {
          for (int j = 0; j < 3; j++) {
            if (five == 0) {
              return false;
            }
            five--;
          }
        } else {
          ten--;
          if (five == 0) {
            return false;
          }
          five--;
        }
      }
    }
    return true;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

