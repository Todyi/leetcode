package easy._0000_0099._067_add_binary;/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {

//294/294 cases passed (1 ms)
//Your runtime beats 100 % of java submissions
//Your memory usage beats 5.62 % of java submissions (38.6 MB)
  public String addBinary(String a, String b) {
    StringBuffer sb = new StringBuffer();
    int aFlag = a.length() - 1;
    int bFlag = b.length() - 1;
    int carry = 0;
    while (aFlag >= 0 || bFlag >= 0 || carry > 0){
      int aItem = aFlag < 0 ? 0:a.charAt(aFlag--)-'0';
      int bItem = bFlag < 0 ? 0:b.charAt(bFlag--)-'0';
      int sum = aItem + bItem + carry;
      sb.append(sum & 1);
      carry = sum >> 1;
    }
    return sb.reverse().toString();

  }

}
// @lc code=end

