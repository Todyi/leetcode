package easy._0400_0499._434_number_of_segments_in_a_string;

//Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
//
// Please note that the string does not contain any non-printable characters.
//
// Example:
//
//Input: "Hello, my name is John"
//Output: 5
//
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.4 MB,击败了8.33% 的Java用户
//  public int countSegments(String s) {
//    if (s == null) {
//      return 0;
//    }
//    String[] i = s.split(" ");
//    int count = 0;
//    for (String s1 : i) {
//      if (!s1.isEmpty()) {
//        count++;
//      }
//    }
//    return count;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.7 MB,击败了8.33% 的Java用户
  public int countSegments(String s) {
    if (s == null) {
      return 0;
    }
    Character lastC = null;
    int count = 0;
    for (char c : s.toCharArray()) {
      if (c == ' ' && lastC != null && lastC != ' ') {
        count++;
      }
      lastC = c;
    }
    if ((-1 == s.lastIndexOf(' ') && 0 < s.length())
        || (0 < s.lastIndexOf(' ') && s.lastIndexOf(' ') < s.length() - 1)) {
      count++;
    }
    return count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

