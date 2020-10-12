package easy._0700_0799._709_to_lower_case;

//Implement function ToLowerCase() that has a string parameter str, and returns
//the same string in lowercase.
//
//
//
//
// Example 1:
//
//
//Input: "Hello"
//Output: "hello"
//
//
//
// Example 2:
//
//
//Input: "here"
//Output: "here"
//
//
//
// Example 3:
//
//
//Input: "LOVELY"
//Output: "lovely"
//
//
//
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.4 MB,击败了43.66% 的Java用户
  public String toLowerCase(String str) {
    char[] arr = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char c : arr) {
      if ('A' <= c && c <= 'Z') {
        c = (char) (c - 'A' + 'a');
      }
      sb.append(c);
    }
    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

