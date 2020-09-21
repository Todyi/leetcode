package easy._1100_1199._1108_defanging_an_ip_address;

//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//
// A defanged IP address replaces every period "." with "[.]".
//
//
// Example 1:
// Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
// Example 2:
// Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"
//
//
// Constraints:
//
//
// The given address is a valid IPv4 address.
// Related Topics String
// 👍 470 👎 921


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了87.97% 的Java用户
  public String defangIPaddr(String address) {
    char[] arr = address.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '.') {
        sb.append('[').append('.').append(']');
      } else {
        sb.append(arr[i]);
      }
    }
    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

