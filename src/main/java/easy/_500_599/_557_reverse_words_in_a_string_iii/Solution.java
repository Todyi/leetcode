package easy._500_599._557_reverse_words_in_a_string_iii;

//Given a string,
// you need to reverse the order of characters in each word within a sentence
// while still preserving whitespace and initial word order.
//
// Example 1:
//
//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
//
//
//
// Note:
//In the string, each word is separated by single space
// and there will not be any extra space in the string.
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:6 ms,击败了52.89% 的Java用户
  //  内存消耗:40.1 MB,击败了22.81% 的Java用户
//  public String reverseWords(String s) {
//    String[] strings = s.split(" ");
//    StringBuilder sb = new StringBuilder();
//    for (int i = 0; i < strings.length; i++) {
//      sb.append(" ");
//      char[] arr = strings[i].toCharArray();
//      for (int j = arr.length - 1; j >= 0; j--) {
//        sb.append(arr[j]);
//      }
//    }
//    return sb.deleteCharAt(0).toString();
//  }

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:39.8 MB,击败了45.61% 的Java用户
  public String reverseWords(String s) {
    char[] arr = s.toCharArray();
    int start = 0, i = 0;
    for (; i < arr.length; i++) {
      if (arr[i] == ' ') {
        if (start < i) {
          reverse(arr, start, i - 1);
        }
        while (arr[++i] == ' ') {
        }
        start = i;
      }
    }
    reverse(arr, start, i - 1);
    return new String(arr);
  }

  public void reverse(char[] arr, int start, int end) {
    while (start < end) {
      char tmp = arr[start];
      arr[start++] = arr[end];
      arr[end--] = tmp;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

